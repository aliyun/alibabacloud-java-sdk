// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WebofficeUser extends TeaModel {
    /**
     * <p>The custom URL of the avatar picture. The avatar picture is displayed on the WebOffice page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/?id=user1">http://example.com/?id=user1</a></p>
     */
    @NameInMap("Avatar")
    public String avatar;

    /**
     * <p>The custom user ID. The user ID is displayed on the WebOffice page. A user ID can contain letters and digits and cannot exceed 15 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The custom username. The username is displayed on the WebOffice page. The username must meet the following requirements:</p>
     * <ul>
     * <li>A username can contain digits, letters, hyphens (-), underscores (_), plus signs (+), forward slashes (/), equal signs (=), and at signs (@).</li>
     * <li>A username can contain up to 32 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-user1</p>
     */
    @NameInMap("Name")
    public String name;

    public static WebofficeUser build(java.util.Map<String, ?> map) throws Exception {
        WebofficeUser self = new WebofficeUser();
        return TeaModel.build(map, self);
    }

    public WebofficeUser setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public WebofficeUser setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WebofficeUser setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
