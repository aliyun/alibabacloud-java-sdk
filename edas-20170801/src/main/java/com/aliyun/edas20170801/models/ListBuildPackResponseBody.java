// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListBuildPackResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BuildPackList")
    public ListBuildPackResponseBodyBuildPackList buildPackList;

    @NameInMap("Code")
    public Integer code;

    public static ListBuildPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBuildPackResponseBody self = new ListBuildPackResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBuildPackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBuildPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBuildPackResponseBody setBuildPackList(ListBuildPackResponseBodyBuildPackList buildPackList) {
        this.buildPackList = buildPackList;
        return this;
    }
    public ListBuildPackResponseBodyBuildPackList getBuildPackList() {
        return this.buildPackList;
    }

    public ListBuildPackResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListBuildPackResponseBodyBuildPackListBuildPack extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("PandoraVersion")
        public String pandoraVersion;

        @NameInMap("PandoraDesc")
        public String pandoraDesc;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("PluginInfo")
        public String pluginInfo;

        @NameInMap("TengineDownloadUrl")
        public String tengineDownloadUrl;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("TomcatPath")
        public String tomcatPath;

        @NameInMap("TomcatDesc")
        public String tomcatDesc;

        @NameInMap("SupportFeatures")
        public String supportFeatures;

        @NameInMap("TomcatDownloadUrl")
        public String tomcatDownloadUrl;

        @NameInMap("TomcatVersion")
        public String tomcatVersion;

        @NameInMap("PandoraDownloadUrl")
        public String pandoraDownloadUrl;

        @NameInMap("PackVersion")
        public String packVersion;

        @NameInMap("MultipleTenant")
        public Boolean multipleTenant;

        @NameInMap("TengineImageId")
        public String tengineImageId;

        @NameInMap("WithTengine")
        public Boolean withTengine;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("ScriptVersion")
        public String scriptVersion;

        public static ListBuildPackResponseBodyBuildPackListBuildPack build(java.util.Map<String, ?> map) throws Exception {
            ListBuildPackResponseBodyBuildPackListBuildPack self = new ListBuildPackResponseBodyBuildPackListBuildPack();
            return TeaModel.build(map, self);
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPandoraVersion(String pandoraVersion) {
            this.pandoraVersion = pandoraVersion;
            return this;
        }
        public String getPandoraVersion() {
            return this.pandoraVersion;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPandoraDesc(String pandoraDesc) {
            this.pandoraDesc = pandoraDesc;
            return this;
        }
        public String getPandoraDesc() {
            return this.pandoraDesc;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPluginInfo(String pluginInfo) {
            this.pluginInfo = pluginInfo;
            return this;
        }
        public String getPluginInfo() {
            return this.pluginInfo;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTengineDownloadUrl(String tengineDownloadUrl) {
            this.tengineDownloadUrl = tengineDownloadUrl;
            return this;
        }
        public String getTengineDownloadUrl() {
            return this.tengineDownloadUrl;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatPath(String tomcatPath) {
            this.tomcatPath = tomcatPath;
            return this;
        }
        public String getTomcatPath() {
            return this.tomcatPath;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatDesc(String tomcatDesc) {
            this.tomcatDesc = tomcatDesc;
            return this;
        }
        public String getTomcatDesc() {
            return this.tomcatDesc;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setSupportFeatures(String supportFeatures) {
            this.supportFeatures = supportFeatures;
            return this;
        }
        public String getSupportFeatures() {
            return this.supportFeatures;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatDownloadUrl(String tomcatDownloadUrl) {
            this.tomcatDownloadUrl = tomcatDownloadUrl;
            return this;
        }
        public String getTomcatDownloadUrl() {
            return this.tomcatDownloadUrl;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatVersion(String tomcatVersion) {
            this.tomcatVersion = tomcatVersion;
            return this;
        }
        public String getTomcatVersion() {
            return this.tomcatVersion;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPandoraDownloadUrl(String pandoraDownloadUrl) {
            this.pandoraDownloadUrl = pandoraDownloadUrl;
            return this;
        }
        public String getPandoraDownloadUrl() {
            return this.pandoraDownloadUrl;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPackVersion(String packVersion) {
            this.packVersion = packVersion;
            return this;
        }
        public String getPackVersion() {
            return this.packVersion;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setMultipleTenant(Boolean multipleTenant) {
            this.multipleTenant = multipleTenant;
            return this;
        }
        public Boolean getMultipleTenant() {
            return this.multipleTenant;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTengineImageId(String tengineImageId) {
            this.tengineImageId = tengineImageId;
            return this;
        }
        public String getTengineImageId() {
            return this.tengineImageId;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setWithTengine(Boolean withTengine) {
            this.withTengine = withTengine;
            return this;
        }
        public Boolean getWithTengine() {
            return this.withTengine;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

    }

    public static class ListBuildPackResponseBodyBuildPackList extends TeaModel {
        @NameInMap("BuildPack")
        public java.util.List<ListBuildPackResponseBodyBuildPackListBuildPack> buildPack;

        public static ListBuildPackResponseBodyBuildPackList build(java.util.Map<String, ?> map) throws Exception {
            ListBuildPackResponseBodyBuildPackList self = new ListBuildPackResponseBodyBuildPackList();
            return TeaModel.build(map, self);
        }

        public ListBuildPackResponseBodyBuildPackList setBuildPack(java.util.List<ListBuildPackResponseBodyBuildPackListBuildPack> buildPack) {
            this.buildPack = buildPack;
            return this;
        }
        public java.util.List<ListBuildPackResponseBodyBuildPackListBuildPack> getBuildPack() {
            return this.buildPack;
        }

    }

}
