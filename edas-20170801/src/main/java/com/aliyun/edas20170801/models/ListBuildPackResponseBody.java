// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListBuildPackResponseBody extends TeaModel {
    /**
     * <p>The returned versions of EDAS Container.</p>
     */
    @NameInMap("BuildPackList")
    public ListBuildPackResponseBodyBuildPackList buildPackList;

    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBuildPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBuildPackResponseBody self = new ListBuildPackResponseBody();
        return TeaModel.build(map, self);
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

    public static class ListBuildPackResponseBodyBuildPackListBuildPack extends TeaModel {
        /**
         * <p>The build package number of EDAS Container.</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether the EDAS Container version is disabled. A disabled version cannot be configured for use.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The features of the EDAS Container version, which are released for public preview.</p>
         */
        @NameInMap("Feature")
        public String feature;

        /**
         * <p>The ID of the base image that corresponds to EDAS Container.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Indicates whether EDAS Container supports multitenancy.</p>
         */
        @NameInMap("MultipleTenant")
        public Boolean multipleTenant;

        /**
         * <p>The version of the application.</p>
         */
        @NameInMap("PackVersion")
        public String packVersion;

        /**
         * <p>The description of the Pandora container.</p>
         */
        @NameInMap("PandoraDesc")
        public String pandoraDesc;

        /**
         * <p>The download URL of the Pandora installer.</p>
         */
        @NameInMap("PandoraDownloadUrl")
        public String pandoraDownloadUrl;

        /**
         * <p>The version of the Pandora container.</p>
         */
        @NameInMap("PandoraVersion")
        public String pandoraVersion;

        /**
         * <p>The description of the plug-in.</p>
         */
        @NameInMap("PluginInfo")
        public String pluginInfo;

        /**
         * <p>The name of the Shell script that runs EDAS Container.</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The version of the Shell script that runs EDAS Container.</p>
         */
        @NameInMap("ScriptVersion")
        public String scriptVersion;

        /**
         * <p>The features supported by EDAS Container.</p>
         */
        @NameInMap("SupportFeatures")
        public String supportFeatures;

        /**
         * <p>The download URL of the Tengine installer.</p>
         */
        @NameInMap("TengineDownloadUrl")
        public String tengineDownloadUrl;

        /**
         * <p>The ID of the Tengine image that corresponds to EDAS Container.</p>
         */
        @NameInMap("TengineImageId")
        public String tengineImageId;

        /**
         * <p>The description of the Tomcat container.</p>
         */
        @NameInMap("TomcatDesc")
        public String tomcatDesc;

        /**
         * <p>The download URL of the Tomcat installer.</p>
         */
        @NameInMap("TomcatDownloadUrl")
        public String tomcatDownloadUrl;

        /**
         * <p>The directory of the Tomcat container.</p>
         */
        @NameInMap("TomcatPath")
        public String tomcatPath;

        /**
         * <p>The version of the Tomcat container.</p>
         */
        @NameInMap("TomcatVersion")
        public String tomcatVersion;

        /**
         * <p>Indicates whether EDAS Container supports traffic management.</p>
         */
        @NameInMap("WithTengine")
        public Boolean withTengine;

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

        public ListBuildPackResponseBodyBuildPackListBuildPack setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setMultipleTenant(Boolean multipleTenant) {
            this.multipleTenant = multipleTenant;
            return this;
        }
        public Boolean getMultipleTenant() {
            return this.multipleTenant;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPackVersion(String packVersion) {
            this.packVersion = packVersion;
            return this;
        }
        public String getPackVersion() {
            return this.packVersion;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPandoraDesc(String pandoraDesc) {
            this.pandoraDesc = pandoraDesc;
            return this;
        }
        public String getPandoraDesc() {
            return this.pandoraDesc;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPandoraDownloadUrl(String pandoraDownloadUrl) {
            this.pandoraDownloadUrl = pandoraDownloadUrl;
            return this;
        }
        public String getPandoraDownloadUrl() {
            return this.pandoraDownloadUrl;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPandoraVersion(String pandoraVersion) {
            this.pandoraVersion = pandoraVersion;
            return this;
        }
        public String getPandoraVersion() {
            return this.pandoraVersion;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setPluginInfo(String pluginInfo) {
            this.pluginInfo = pluginInfo;
            return this;
        }
        public String getPluginInfo() {
            return this.pluginInfo;
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

        public ListBuildPackResponseBodyBuildPackListBuildPack setSupportFeatures(String supportFeatures) {
            this.supportFeatures = supportFeatures;
            return this;
        }
        public String getSupportFeatures() {
            return this.supportFeatures;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTengineDownloadUrl(String tengineDownloadUrl) {
            this.tengineDownloadUrl = tengineDownloadUrl;
            return this;
        }
        public String getTengineDownloadUrl() {
            return this.tengineDownloadUrl;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTengineImageId(String tengineImageId) {
            this.tengineImageId = tengineImageId;
            return this;
        }
        public String getTengineImageId() {
            return this.tengineImageId;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatDesc(String tomcatDesc) {
            this.tomcatDesc = tomcatDesc;
            return this;
        }
        public String getTomcatDesc() {
            return this.tomcatDesc;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatDownloadUrl(String tomcatDownloadUrl) {
            this.tomcatDownloadUrl = tomcatDownloadUrl;
            return this;
        }
        public String getTomcatDownloadUrl() {
            return this.tomcatDownloadUrl;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatPath(String tomcatPath) {
            this.tomcatPath = tomcatPath;
            return this;
        }
        public String getTomcatPath() {
            return this.tomcatPath;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setTomcatVersion(String tomcatVersion) {
            this.tomcatVersion = tomcatVersion;
            return this;
        }
        public String getTomcatVersion() {
            return this.tomcatVersion;
        }

        public ListBuildPackResponseBodyBuildPackListBuildPack setWithTengine(Boolean withTengine) {
            this.withTengine = withTengine;
            return this;
        }
        public Boolean getWithTengine() {
            return this.withTengine;
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
