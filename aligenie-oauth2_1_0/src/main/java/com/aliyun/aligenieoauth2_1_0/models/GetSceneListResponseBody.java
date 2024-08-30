// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetSceneListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>435CF567-58DC-5761-AFA8-650772602E2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SceneList")
    public java.util.List<GetSceneListResponseBodySceneList> sceneList;

    public static GetSceneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSceneListResponseBody self = new GetSceneListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSceneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneListResponseBody setSceneList(java.util.List<GetSceneListResponseBodySceneList> sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public java.util.List<GetSceneListResponseBodySceneList> getSceneList() {
        return this.sceneList;
    }

    public static class GetSceneListResponseBodySceneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>840960b85c3c48e0bd7260c1718295fd</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        public static GetSceneListResponseBodySceneList build(java.util.Map<String, ?> map) throws Exception {
            GetSceneListResponseBodySceneList self = new GetSceneListResponseBodySceneList();
            return TeaModel.build(map, self);
        }

        public GetSceneListResponseBodySceneList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetSceneListResponseBodySceneList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

}
