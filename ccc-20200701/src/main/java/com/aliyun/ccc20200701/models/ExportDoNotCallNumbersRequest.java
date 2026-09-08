// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportDoNotCallNumbersRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the scope of the do-not-call numbers. A value of SYSTEM applies to your entire Alibaba Cloud account, while INSTANCE applies only to the current instance. The default value is INSTANCE.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The keyword for a fuzzy search of phone numbers or remarks. If this parameter is left empty, no keyword-based filtering is applied.</p>
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
