// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateRcuSceneRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneRelationExtDTO")
    public UpdateRcuSceneRequestSceneRelationExtDTO sceneRelationExtDTO;

    public static UpdateRcuSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRcuSceneRequest self = new UpdateRcuSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRcuSceneRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateRcuSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateRcuSceneRequest setSceneRelationExtDTO(UpdateRcuSceneRequestSceneRelationExtDTO sceneRelationExtDTO) {
        this.sceneRelationExtDTO = sceneRelationExtDTO;
        return this;
    }
    public UpdateRcuSceneRequestSceneRelationExtDTO getSceneRelationExtDTO() {
        return this.sceneRelationExtDTO;
    }

    public static class UpdateRcuSceneRequestSceneRelationExtDTO extends TeaModel {
        @NameInMap("CorpusList")
        public java.util.List<String> corpusList;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        public static UpdateRcuSceneRequestSceneRelationExtDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateRcuSceneRequestSceneRelationExtDTO self = new UpdateRcuSceneRequestSceneRelationExtDTO();
            return TeaModel.build(map, self);
        }

        public UpdateRcuSceneRequestSceneRelationExtDTO setCorpusList(java.util.List<String> corpusList) {
            this.corpusList = corpusList;
            return this;
        }
        public java.util.List<String> getCorpusList() {
            return this.corpusList;
        }

        public UpdateRcuSceneRequestSceneRelationExtDTO setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRcuSceneRequestSceneRelationExtDTO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateRcuSceneRequestSceneRelationExtDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
