// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyClusterAttributesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to modify.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The new cluster description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IDs of the images.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The new image type of the cluster. Valid values:</p>
     * <br>
     * <p>*   system: public image</p>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     * <p>*   marketplace: Alibaba Cloud Marketplace image</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The new cluster name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the node to which you want to bind the RAM role.</p>
     */
    @NameInMap("RamNodeTypes")
    public java.util.List<String> ramNodeTypes;

    /**
     * <p>The name of the instance RAM role.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The parameters that are used to connect to the Windows AD server.</p>
     */
    @NameInMap("WinAdPar")
    public ModifyClusterAttributesRequestWinAdPar winAdPar;

    public static ModifyClusterAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAttributesRequest self = new ModifyClusterAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAttributesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyClusterAttributesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyClusterAttributesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public ModifyClusterAttributesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyClusterAttributesRequest setRamNodeTypes(java.util.List<String> ramNodeTypes) {
        this.ramNodeTypes = ramNodeTypes;
        return this;
    }
    public java.util.List<String> getRamNodeTypes() {
        return this.ramNodeTypes;
    }

    public ModifyClusterAttributesRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ModifyClusterAttributesRequest setWinAdPar(ModifyClusterAttributesRequestWinAdPar winAdPar) {
        this.winAdPar = winAdPar;
        return this;
    }
    public ModifyClusterAttributesRequestWinAdPar getWinAdPar() {
        return this.winAdPar;
    }

    public static class ModifyClusterAttributesRequestWinAdPar extends TeaModel {
        /**
         * <p>The domain name of the Windows AD server.</p>
         */
        @NameInMap("AdDc")
        public String adDc;

        /**
         * <p>The IP address of the Windows AD server.</p>
         */
        @NameInMap("AdIp")
        public String adIp;

        /**
         * <p>The Windows AD server administrator.</p>
         */
        @NameInMap("AdUser")
        public String adUser;

        /**
         * <p>The administrator password of the Windows AD server.</p>
         */
        @NameInMap("AdUserPasswd")
        public String adUserPasswd;

        /**
         * <p>The home directory of the Linux server.</p>
         */
        @NameInMap("FallbackHomeDir")
        public String fallbackHomeDir;

        public static ModifyClusterAttributesRequestWinAdPar build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterAttributesRequestWinAdPar self = new ModifyClusterAttributesRequestWinAdPar();
            return TeaModel.build(map, self);
        }

        public ModifyClusterAttributesRequestWinAdPar setAdDc(String adDc) {
            this.adDc = adDc;
            return this;
        }
        public String getAdDc() {
            return this.adDc;
        }

        public ModifyClusterAttributesRequestWinAdPar setAdIp(String adIp) {
            this.adIp = adIp;
            return this;
        }
        public String getAdIp() {
            return this.adIp;
        }

        public ModifyClusterAttributesRequestWinAdPar setAdUser(String adUser) {
            this.adUser = adUser;
            return this;
        }
        public String getAdUser() {
            return this.adUser;
        }

        public ModifyClusterAttributesRequestWinAdPar setAdUserPasswd(String adUserPasswd) {
            this.adUserPasswd = adUserPasswd;
            return this;
        }
        public String getAdUserPasswd() {
            return this.adUserPasswd;
        }

        public ModifyClusterAttributesRequestWinAdPar setFallbackHomeDir(String fallbackHomeDir) {
            this.fallbackHomeDir = fallbackHomeDir;
            return this;
        }
        public String getFallbackHomeDir() {
            return this.fallbackHomeDir;
        }

    }

}
