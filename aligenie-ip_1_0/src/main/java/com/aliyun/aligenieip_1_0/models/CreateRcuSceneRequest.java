// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateRcuSceneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>520a0c0***5eb</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yoga</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("CorpusList")
        public java.util.List<String> corpusList;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/shuimian.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/shuimian.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>This parameter is required.</p>
         */
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
