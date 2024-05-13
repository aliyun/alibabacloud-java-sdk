// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportDoNotCallNumbersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Scope")
    public String scope;

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
