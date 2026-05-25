// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class FullSampleItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>1740489688615</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>testUser</p>
     */
    @NameInMap("Operator")
    public String operator;

    public static FullSampleItem build(java.util.Map<String, ?> map) throws Exception {
        FullSampleItem self = new FullSampleItem();
        return TeaModel.build(map, self);
    }

    public FullSampleItem setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public FullSampleItem setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public FullSampleItem setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
