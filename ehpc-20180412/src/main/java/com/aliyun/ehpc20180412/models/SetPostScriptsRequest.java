// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetPostScriptsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to obtain the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-sh-EnjshUxn</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The post-processing scripts.</p>
     */
    @NameInMap("PostInstallScripts")
    public java.util.List<SetPostScriptsRequestPostInstallScripts> postInstallScripts;

    /**
     * <p>The ID of the region where the cluster resides. You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> operation to query the latest region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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
        /**
         * <p>The parameter that is used to run the post-processing script.</p>
         * 
         * <strong>example:</strong>
         * <p>-h</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The URL that is used to download the post-processing script.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bucket.oss-cn-shanghai.aliyuncs.com/postscript_examples.sh">https://bucket.oss-cn-shanghai.aliyuncs.com/postscript_examples.sh</a></p>
         */
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
