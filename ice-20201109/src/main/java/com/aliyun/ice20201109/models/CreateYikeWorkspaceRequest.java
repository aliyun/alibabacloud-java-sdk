// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateYikeWorkspaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("UserCountLimit")
    public Long userCountLimit;

    public static CreateYikeWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeWorkspaceRequest self = new CreateYikeWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateYikeWorkspaceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateYikeWorkspaceRequest setUserCountLimit(Long userCountLimit) {
        this.userCountLimit = userCountLimit;
        return this;
    }
    public Long getUserCountLimit() {
        return this.userCountLimit;
    }

}
