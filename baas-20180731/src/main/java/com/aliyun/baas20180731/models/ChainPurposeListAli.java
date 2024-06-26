// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ChainPurposeListAli extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Extend")
    public Boolean extend;

    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Item")
    public Boolean item;

    /**
     * <strong>example:</strong>
     * <p>FIN</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>金融</p>
     */
    @NameInMap("Purpose")
    public String purpose;

    public static ChainPurposeListAli build(java.util.Map<String, ?> map) throws Exception {
        ChainPurposeListAli self = new ChainPurposeListAli();
        return TeaModel.build(map, self);
    }

    public ChainPurposeListAli setExtend(Boolean extend) {
        this.extend = extend;
        return this;
    }
    public Boolean getExtend() {
        return this.extend;
    }

    public ChainPurposeListAli setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainPurposeListAli setItem(Boolean item) {
        this.item = item;
        return this;
    }
    public Boolean getItem() {
        return this.item;
    }

    public ChainPurposeListAli setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ChainPurposeListAli setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}
