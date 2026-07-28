// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class RamBindingEntry extends TeaModel {
    /**
     * <p>The unique identifier (UID) of the bound RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("boundUid")
    public String boundUid;

    /**
     * <p>The bound RAM username.</p>
     * 
     * <strong>example:</strong>
     * <p>test-user</p>
     */
    @NameInMap("boundUserName")
    public String boundUserName;

    /**
     * <p>The Milvus username.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("milvusUsername")
    public String milvusUsername;

    public static RamBindingEntry build(java.util.Map<String, ?> map) throws Exception {
        RamBindingEntry self = new RamBindingEntry();
        return TeaModel.build(map, self);
    }

    public RamBindingEntry setBoundUid(String boundUid) {
        this.boundUid = boundUid;
        return this;
    }
    public String getBoundUid() {
        return this.boundUid;
    }

    public RamBindingEntry setBoundUserName(String boundUserName) {
        this.boundUserName = boundUserName;
        return this;
    }
    public String getBoundUserName() {
        return this.boundUserName;
    }

    public RamBindingEntry setMilvusUsername(String milvusUsername) {
        this.milvusUsername = milvusUsername;
        return this;
    }
    public String getMilvusUsername() {
        return this.milvusUsername;
    }

}
