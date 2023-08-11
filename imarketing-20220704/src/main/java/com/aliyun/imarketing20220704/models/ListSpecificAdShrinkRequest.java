// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListSpecificAdShrinkRequest extends TeaModel {
    /**
     * <p>app</p>
     */
    @NameInMap("App")
    public String appShrink;

    @NameInMap("Ext")
    public String extShrink;

    /**
     * <p>id</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>imp</p>
     */
    @NameInMap("Imp")
    public String impShrink;

    /**
     * <p>user</p>
     */
    @NameInMap("User")
    public String userShrink;

    @NameInMap("Verifyad")
    public String verifyadShrink;

    public static ListSpecificAdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSpecificAdShrinkRequest self = new ListSpecificAdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSpecificAdShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public ListSpecificAdShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public ListSpecificAdShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListSpecificAdShrinkRequest setImpShrink(String impShrink) {
        this.impShrink = impShrink;
        return this;
    }
    public String getImpShrink() {
        return this.impShrink;
    }

    public ListSpecificAdShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

    public ListSpecificAdShrinkRequest setVerifyadShrink(String verifyadShrink) {
        this.verifyadShrink = verifyadShrink;
        return this;
    }
    public String getVerifyadShrink() {
        return this.verifyadShrink;
    }

}
