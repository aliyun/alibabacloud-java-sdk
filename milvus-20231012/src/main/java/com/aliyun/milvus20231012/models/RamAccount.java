// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class RamAccount extends TeaModel {
    /**
     * <p>Specifies whether the RamAccount can be bound to other resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("bindable")
    public Boolean bindable;

    /**
     * <p>The display name for the RamAccount, which appears in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>Test User</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The unique identifier for the RamAccount.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("uid")
    public String uid;

    /**
     * <p>The user name for the RamAccount.</p>
     * 
     * <strong>example:</strong>
     * <p>test-user</p>
     */
    @NameInMap("userName")
    public String userName;

    public static RamAccount build(java.util.Map<String, ?> map) throws Exception {
        RamAccount self = new RamAccount();
        return TeaModel.build(map, self);
    }

    public RamAccount setBindable(Boolean bindable) {
        this.bindable = bindable;
        return this;
    }
    public Boolean getBindable() {
        return this.bindable;
    }

    public RamAccount setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RamAccount setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public RamAccount setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
