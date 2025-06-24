// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormEngineConfigResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("EngineConfigs")
    public java.util.List<GetLindormEngineConfigResponseBodyEngineConfigs> engineConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLindormEngineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormEngineConfigResponseBody self = new GetLindormEngineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormEngineConfigResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLindormEngineConfigResponseBody setEngineConfigs(java.util.List<GetLindormEngineConfigResponseBodyEngineConfigs> engineConfigs) {
        this.engineConfigs = engineConfigs;
        return this;
    }
    public java.util.List<GetLindormEngineConfigResponseBodyEngineConfigs> getEngineConfigs() {
        return this.engineConfigs;
    }

    public GetLindormEngineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems extends TeaModel {
        @NameInMap("ConfigItemKey")
        public String configItemKey;

        @NameInMap("ConfigItemValue")
        public String configItemValue;

        public static GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems build(java.util.Map<String, ?> map) throws Exception {
            GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems self = new GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems();
            return TeaModel.build(map, self);
        }

        public GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles extends TeaModel {
        @NameInMap("ConfigItems")
        public java.util.List<GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems> configItems;

        @NameInMap("FileName")
        public String fileName;

        public static GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles build(java.util.Map<String, ?> map) throws Exception {
            GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles self = new GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles();
            return TeaModel.build(map, self);
        }

        public GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles setConfigItems(java.util.List<GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems> configItems) {
            this.configItems = configItems;
            return this;
        }
        public java.util.List<GetLindormEngineConfigResponseBodyEngineConfigsConfigFilesConfigItems> getConfigItems() {
            return this.configItems;
        }

        public GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetLindormEngineConfigResponseBodyEngineConfigs extends TeaModel {
        @NameInMap("ConfigFiles")
        public java.util.List<GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles> configFiles;

        @NameInMap("Engine")
        public String engine;

        public static GetLindormEngineConfigResponseBodyEngineConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetLindormEngineConfigResponseBodyEngineConfigs self = new GetLindormEngineConfigResponseBodyEngineConfigs();
            return TeaModel.build(map, self);
        }

        public GetLindormEngineConfigResponseBodyEngineConfigs setConfigFiles(java.util.List<GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles> configFiles) {
            this.configFiles = configFiles;
            return this;
        }
        public java.util.List<GetLindormEngineConfigResponseBodyEngineConfigsConfigFiles> getConfigFiles() {
            return this.configFiles;
        }

        public GetLindormEngineConfigResponseBodyEngineConfigs setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

    }

}
