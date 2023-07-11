// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportHotelConfigRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("ImportHotelConfigRequest")
    public ImportHotelConfigRequestImportHotelConfigRequest importHotelConfigRequest;

    public static ImportHotelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportHotelConfigRequest self = new ImportHotelConfigRequest();
        return TeaModel.build(map, self);
    }

    public ImportHotelConfigRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ImportHotelConfigRequest setImportHotelConfigRequest(ImportHotelConfigRequestImportHotelConfigRequest importHotelConfigRequest) {
        this.importHotelConfigRequest = importHotelConfigRequest;
        return this;
    }
    public ImportHotelConfigRequestImportHotelConfigRequest getImportHotelConfigRequest() {
        return this.importHotelConfigRequest;
    }

    public static class ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes extends TeaModel {
        @NameInMap("CorpusList")
        public java.util.List<String> corpusList;

        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        @NameInMap("SceneId")
        public String sceneId;

        public static ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes build(java.util.Map<String, ?> map) throws Exception {
            ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes self = new ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes();
            return TeaModel.build(map, self);
        }

        public ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes setCorpusList(java.util.List<String> corpusList) {
            this.corpusList = corpusList;
            return this;
        }
        public java.util.List<String> getCorpusList() {
            return this.corpusList;
        }

        public ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

    public static class ImportHotelConfigRequestImportHotelConfigRequest extends TeaModel {
        @NameInMap("RcuCustomScenes")
        public java.util.List<ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes> rcuCustomScenes;

        public static ImportHotelConfigRequestImportHotelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
            ImportHotelConfigRequestImportHotelConfigRequest self = new ImportHotelConfigRequestImportHotelConfigRequest();
            return TeaModel.build(map, self);
        }

        public ImportHotelConfigRequestImportHotelConfigRequest setRcuCustomScenes(java.util.List<ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes> rcuCustomScenes) {
            this.rcuCustomScenes = rcuCustomScenes;
            return this;
        }
        public java.util.List<ImportHotelConfigRequestImportHotelConfigRequestRcuCustomScenes> getRcuCustomScenes() {
            return this.rcuCustomScenes;
        }

    }

}
