// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportDoNotCallNumbersRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The application scope. Valid values: SYSTEM and INSTANCE. SYSTEM indicates system-level do-not-call, and INSTANCE indicates customer-defined do-not-call. SYSTEM is associated with the Alibaba Cloud account to which the instance belongs, and INSTANCE is associated only with the current instance. This parameter is optional. Default value: INSTANCE.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>Specifies the keyword to perform a fuzzy match based on the phone number or remark. This parameter is optional. Default value: empty. An empty value indicates that no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>RemarkA</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    public static ExportDoNotCallNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDoNotCallNumbersRequest self = new ExportDoNotCallNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ExportDoNotCallNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportDoNotCallNumbersRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ExportDoNotCallNumbersRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
