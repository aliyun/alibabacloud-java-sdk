// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class ListUninstallDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endDs")
    public String endDs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startDs")
    public String startDs;

    public static ListUninstallDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallDetailRequest self = new ListUninstallDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListUninstallDetailRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListUninstallDetailRequest setEndDs(String endDs) {
        this.endDs = endDs;
        return this;
    }
    public String getEndDs() {
        return this.endDs;
    }

    public ListUninstallDetailRequest setStartDs(String startDs) {
        this.startDs = startDs;
        return this;
    }
    public String getStartDs() {
        return this.startDs;
    }

}
