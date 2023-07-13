// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportHotelConfigRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("ImportHotelConfig")
    public ImportHotelConfigRequestImportHotelConfig importHotelConfig;

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

    public ImportHotelConfigRequest setImportHotelConfig(ImportHotelConfigRequestImportHotelConfig importHotelConfig) {
        this.importHotelConfig = importHotelConfig;
        return this;
    }
    public ImportHotelConfigRequestImportHotelConfig getImportHotelConfig() {
        return this.importHotelConfig;
    }

    public static class ImportHotelConfigRequestImportHotelConfigRcuCustomScenes extends TeaModel {
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

        public static ImportHotelConfigRequestImportHotelConfigRcuCustomScenes build(java.util.Map<String, ?> map) throws Exception {
            ImportHotelConfigRequestImportHotelConfigRcuCustomScenes self = new ImportHotelConfigRequestImportHotelConfigRcuCustomScenes();
            return TeaModel.build(map, self);
        }

        public ImportHotelConfigRequestImportHotelConfigRcuCustomScenes setCorpusList(java.util.List<String> corpusList) {
            this.corpusList = corpusList;
            return this;
        }
        public java.util.List<String> getCorpusList() {
            return this.corpusList;
        }

        public ImportHotelConfigRequestImportHotelConfigRcuCustomScenes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImportHotelConfigRequestImportHotelConfigRcuCustomScenes setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ImportHotelConfigRequestImportHotelConfigRcuCustomScenes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportHotelConfigRequestImportHotelConfigRcuCustomScenes setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

    public static class ImportHotelConfigRequestImportHotelConfig extends TeaModel {
        @NameInMap("RcuCustomScenes")
        public java.util.List<ImportHotelConfigRequestImportHotelConfigRcuCustomScenes> rcuCustomScenes;

        public static ImportHotelConfigRequestImportHotelConfig build(java.util.Map<String, ?> map) throws Exception {
            ImportHotelConfigRequestImportHotelConfig self = new ImportHotelConfigRequestImportHotelConfig();
            return TeaModel.build(map, self);
        }

        public ImportHotelConfigRequestImportHotelConfig setRcuCustomScenes(java.util.List<ImportHotelConfigRequestImportHotelConfigRcuCustomScenes> rcuCustomScenes) {
            this.rcuCustomScenes = rcuCustomScenes;
            return this;
        }
        public java.util.List<ImportHotelConfigRequestImportHotelConfigRcuCustomScenes> getRcuCustomScenes() {
            return this.rcuCustomScenes;
        }

    }

}
