// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 节点CPU架构,支持amd64、arm、arm64。
    @NameInMap("arch")
    public String arch;

    // 边缘托管版集群节点的接入配置。
    @NameInMap("options")
    public DescribeClusterAttachScriptsRequestOptions options;

    public static DescribeClusterAttachScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttachScriptsRequest self = new DescribeClusterAttachScriptsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAttachScriptsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterAttachScriptsRequest setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public DescribeClusterAttachScriptsRequest setOptions(DescribeClusterAttachScriptsRequestOptions options) {
        this.options = options;
        return this;
    }
    public DescribeClusterAttachScriptsRequestOptions getOptions() {
        return this.options;
    }

    public static class DescribeClusterAttachScriptsRequestOptions extends TeaModel {
        // 需要安装的组件列表，默认为空，不安装。
        @NameInMap("allowedClusterAddons")
        public java.util.List<String> allowedClusterAddons;

        // 是否开启iptables，默认值true。
        @NameInMap("enableIptables")
        public Boolean enableIptables;

        // flannel使用的网卡名。默认使用节点默认路由的网卡名。
        @NameInMap("flannelIface")
        public String flannelIface;

        // 表示要接入的节点是否为GPU节点，默认为空。当前支持的GPU版本是Nvidia_Tesla_T4、Nvidia_Tesla_P4、Nvidia_Tesla_P100。
        @NameInMap("gpuVersion")
        public String gpuVersion;

        // 是否由edgeadm安装并检测Runtime，默认false。
        @NameInMap("manageRuntime")
        public Boolean manageRuntime;

        // 设置节点名。  - ""（默认值，表示使用主机名。） - "*"（表示随机生成6位的字符串。） - "*.XXX"（表示随机生成6位字符串+XXX后缀。）
        @NameInMap("nodeNameOverride")
        public String nodeNameOverride;

        // 是否使用静默模式安装。
        @NameInMap("quiet")
        public String quiet;

        public static DescribeClusterAttachScriptsRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttachScriptsRequestOptions self = new DescribeClusterAttachScriptsRequestOptions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttachScriptsRequestOptions setAllowedClusterAddons(java.util.List<String> allowedClusterAddons) {
            this.allowedClusterAddons = allowedClusterAddons;
            return this;
        }
        public java.util.List<String> getAllowedClusterAddons() {
            return this.allowedClusterAddons;
        }

        public DescribeClusterAttachScriptsRequestOptions setEnableIptables(Boolean enableIptables) {
            this.enableIptables = enableIptables;
            return this;
        }
        public Boolean getEnableIptables() {
            return this.enableIptables;
        }

        public DescribeClusterAttachScriptsRequestOptions setFlannelIface(String flannelIface) {
            this.flannelIface = flannelIface;
            return this;
        }
        public String getFlannelIface() {
            return this.flannelIface;
        }

        public DescribeClusterAttachScriptsRequestOptions setGpuVersion(String gpuVersion) {
            this.gpuVersion = gpuVersion;
            return this;
        }
        public String getGpuVersion() {
            return this.gpuVersion;
        }

        public DescribeClusterAttachScriptsRequestOptions setManageRuntime(Boolean manageRuntime) {
            this.manageRuntime = manageRuntime;
            return this;
        }
        public Boolean getManageRuntime() {
            return this.manageRuntime;
        }

        public DescribeClusterAttachScriptsRequestOptions setNodeNameOverride(String nodeNameOverride) {
            this.nodeNameOverride = nodeNameOverride;
            return this;
        }
        public String getNodeNameOverride() {
            return this.nodeNameOverride;
        }

        public DescribeClusterAttachScriptsRequestOptions setQuiet(String quiet) {
            this.quiet = quiet;
            return this;
        }
        public String getQuiet() {
            return this.quiet;
        }

    }

}
