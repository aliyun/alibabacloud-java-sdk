// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateRcuSceneRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneRelationExtDTO")
    public CreateRcuSceneRequestSceneRelationExtDTO sceneRelationExtDTO;

    public static CreateRcuSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRcuSceneRequest self = new CreateRcuSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateRcuSceneRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public CreateRcuSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateRcuSceneRequest setSceneRelationExtDTO(CreateRcuSceneRequestSceneRelationExtDTO sceneRelationExtDTO) {
        this.sceneRelationExtDTO = sceneRelationExtDTO;
        return this;
    }
    public CreateRcuSceneRequestSceneRelationExtDTO getSceneRelationExtDTO() {
        return this.sceneRelationExtDTO;
    }

    public static class CreateRcuSceneRequestSceneRelationExtDTO extends TeaModel {
        @NameInMap("CorpusList")
        public java.util.List<String> corpusList;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        public static CreateRcuSceneRequestSceneRelationExtDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateRcuSceneRequestSceneRelationExtDTO self = new CreateRcuSceneRequestSceneRelationExtDTO();
            return TeaModel.build(map, self);
        }

        public CreateRcuSceneRequestSceneRelationExtDTO setCorpusList(java.util.List<String> corpusList) {
            this.corpusList = corpusList;
            return this;
        }
        public java.util.List<String> getCorpusList() {
            return this.corpusList;
        }

        public CreateRcuSceneRequestSceneRelationExtDTO setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRcuSceneRequestSceneRelationExtDTO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CreateRcuSceneRequestSceneRelationExtDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
