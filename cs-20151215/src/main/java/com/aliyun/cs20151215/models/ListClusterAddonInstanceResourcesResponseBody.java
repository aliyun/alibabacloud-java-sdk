// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterAddonInstanceResourcesResponseBody extends TeaModel {
    @NameInMap("helm_release")
    public ListClusterAddonInstanceResourcesResponseBodyHelmRelease helmRelease;

    @NameInMap("kubernetes_objects")
    public java.util.List<ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects> kubernetesObjects;

    public static ListClusterAddonInstanceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAddonInstanceResourcesResponseBody self = new ListClusterAddonInstanceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterAddonInstanceResourcesResponseBody setHelmRelease(ListClusterAddonInstanceResourcesResponseBodyHelmRelease helmRelease) {
        this.helmRelease = helmRelease;
        return this;
    }
    public ListClusterAddonInstanceResourcesResponseBodyHelmRelease getHelmRelease() {
        return this.helmRelease;
    }

    public ListClusterAddonInstanceResourcesResponseBody setKubernetesObjects(java.util.List<ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects> kubernetesObjects) {
        this.kubernetesObjects = kubernetesObjects;
        return this;
    }
    public java.util.List<ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects> getKubernetesObjects() {
        return this.kubernetesObjects;
    }

    public static class ListClusterAddonInstanceResourcesResponseBodyHelmRelease extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ack-node-problem-detector</p>
         */
        @NameInMap("chart_name")
        public String chartName;

        /**
         * <strong>example:</strong>
         * <p>1.2.28</p>
         */
        @NameInMap("chart_version")
        public String chartVersion;

        /**
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>ack-node-problem-detector</p>
         */
        @NameInMap("release_name")
        public String releaseName;

        public static ListClusterAddonInstanceResourcesResponseBodyHelmRelease build(java.util.Map<String, ?> map) throws Exception {
            ListClusterAddonInstanceResourcesResponseBodyHelmRelease self = new ListClusterAddonInstanceResourcesResponseBodyHelmRelease();
            return TeaModel.build(map, self);
        }

        public ListClusterAddonInstanceResourcesResponseBodyHelmRelease setChartName(String chartName) {
            this.chartName = chartName;
            return this;
        }
        public String getChartName() {
            return this.chartName;
        }

        public ListClusterAddonInstanceResourcesResponseBodyHelmRelease setChartVersion(String chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }
        public String getChartVersion() {
            return this.chartVersion;
        }

        public ListClusterAddonInstanceResourcesResponseBodyHelmRelease setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListClusterAddonInstanceResourcesResponseBodyHelmRelease setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

    }

    public static class ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rbac.authorization.k8s.io</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>ClusterRole</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <strong>example:</strong>
         * <p>terway-pod-reader</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>kube-system</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects build(java.util.Map<String, ?> map) throws Exception {
            ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects self = new ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects();
            return TeaModel.build(map, self);
        }

        public ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListClusterAddonInstanceResourcesResponseBodyKubernetesObjects setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
