// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetPostScriptsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PostInstallScripts")
    public java.util.List<SetPostScriptsRequestPostInstallScripts> postInstallScripts;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPostScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPostScriptsRequest self = new SetPostScriptsRequest();
        return TeaModel.build(map, self);
    }

    public SetPostScriptsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetPostScriptsRequest setPostInstallScripts(java.util.List<SetPostScriptsRequestPostInstallScripts> postInstallScripts) {
        this.postInstallScripts = postInstallScripts;
        return this;
    }
    public java.util.List<SetPostScriptsRequestPostInstallScripts> getPostInstallScripts() {
        return this.postInstallScripts;
    }

    public SetPostScriptsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPostScriptsRequestPostInstallScripts extends TeaModel {
        @NameInMap("Args")
        public String args;

        @NameInMap("Url")
        public String url;

        public static SetPostScriptsRequestPostInstallScripts build(java.util.Map<String, ?> map) throws Exception {
            SetPostScriptsRequestPostInstallScripts self = new SetPostScriptsRequestPostInstallScripts();
            return TeaModel.build(map, self);
        }

        public SetPostScriptsRequestPostInstallScripts setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public SetPostScriptsRequestPostInstallScripts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
