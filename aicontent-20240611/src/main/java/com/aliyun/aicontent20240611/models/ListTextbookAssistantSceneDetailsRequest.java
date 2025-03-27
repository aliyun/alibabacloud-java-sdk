// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantSceneDetailsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
     */
    @NameInMap("authToken")
    public String authToken;

    @NameInMap("sceneIdList")
    public java.util.List<String> sceneIdList;

    public static ListTextbookAssistantSceneDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantSceneDetailsRequest self = new ListTextbookAssistantSceneDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantSceneDetailsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTextbookAssistantSceneDetailsRequest setSceneIdList(java.util.List<String> sceneIdList) {
        this.sceneIdList = sceneIdList;
        return this;
    }
    public java.util.List<String> getSceneIdList() {
        return this.sceneIdList;
    }

}
