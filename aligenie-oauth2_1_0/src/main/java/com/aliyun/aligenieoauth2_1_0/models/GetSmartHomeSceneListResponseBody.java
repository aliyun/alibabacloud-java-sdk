// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetSmartHomeSceneListResponseBody extends TeaModel {
    @NameInMap("FamilySceneList")
    public java.util.List<GetSmartHomeSceneListResponseBodyFamilySceneList> familySceneList;

    /**
     * <strong>example:</strong>
     * <p>435CF567-12DC-5761-AFA8-650774502E2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSmartHomeSceneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHomeSceneListResponseBody self = new GetSmartHomeSceneListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartHomeSceneListResponseBody setFamilySceneList(java.util.List<GetSmartHomeSceneListResponseBodyFamilySceneList> familySceneList) {
        this.familySceneList = familySceneList;
        return this;
    }
    public java.util.List<GetSmartHomeSceneListResponseBodyFamilySceneList> getFamilySceneList() {
        return this.familySceneList;
    }

    public GetSmartHomeSceneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSmartHomeSceneListResponseBodyFamilySceneListSceneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6813AH5586qrw1P5ln/123==</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        public static GetSmartHomeSceneListResponseBodyFamilySceneListSceneList build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHomeSceneListResponseBodyFamilySceneListSceneList self = new GetSmartHomeSceneListResponseBodyFamilySceneListSceneList();
            return TeaModel.build(map, self);
        }

        public GetSmartHomeSceneListResponseBodyFamilySceneListSceneList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetSmartHomeSceneListResponseBodyFamilySceneListSceneList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

    public static class GetSmartHomeSceneListResponseBodyFamilySceneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2iS1AH5eo8qrw1PYBL/Ulq==</p>
         */
        @NameInMap("familyId")
        public String familyId;

        @NameInMap("familyName")
        public String familyName;

        @NameInMap("sceneList")
        public java.util.List<GetSmartHomeSceneListResponseBodyFamilySceneListSceneList> sceneList;

        public static GetSmartHomeSceneListResponseBodyFamilySceneList build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHomeSceneListResponseBodyFamilySceneList self = new GetSmartHomeSceneListResponseBodyFamilySceneList();
            return TeaModel.build(map, self);
        }

        public GetSmartHomeSceneListResponseBodyFamilySceneList setFamilyId(String familyId) {
            this.familyId = familyId;
            return this;
        }
        public String getFamilyId() {
            return this.familyId;
        }

        public GetSmartHomeSceneListResponseBodyFamilySceneList setFamilyName(String familyName) {
            this.familyName = familyName;
            return this;
        }
        public String getFamilyName() {
            return this.familyName;
        }

        public GetSmartHomeSceneListResponseBodyFamilySceneList setSceneList(java.util.List<GetSmartHomeSceneListResponseBodyFamilySceneListSceneList> sceneList) {
            this.sceneList = sceneList;
            return this;
        }
        public java.util.List<GetSmartHomeSceneListResponseBodyFamilySceneListSceneList> getSceneList() {
            return this.sceneList;
        }

    }

}
