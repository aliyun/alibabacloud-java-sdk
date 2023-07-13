// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyClusterAttributesRequest extends TeaModel {
    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>授权实例配置时，要绑定RAM角色的节点类型。</p>
     */
    @NameInMap("RamNodeTypes")
    public java.util.List<String> ramNodeTypes;

    /**
     * <p>授权实例配置时，实例RAM角色的名称。</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

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
        @NameInMap("AdDc")
        public String adDc;

        @NameInMap("AdIp")
        public String adIp;

        @NameInMap("AdUser")
        public String adUser;

        @NameInMap("AdUserPasswd")
        public String adUserPasswd;

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
