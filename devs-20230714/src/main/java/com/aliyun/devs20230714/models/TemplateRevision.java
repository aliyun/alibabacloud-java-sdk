// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateRevision extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-11-19T09:34:38Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>It is a template revision</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>TemplateRevision</p>
     */
    @NameInMap("kind")
    public String kind;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <strong>example:</strong>
     * <p>demo-template</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("spec")
    public TemplateSpec spec;

    @NameInMap("status")
    public TemplateRevisionStatus status;

    /**
     * <strong>example:</strong>
     * <p>demo-template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>1455541096***548</p>
     */
    @NameInMap("uid")
    public String uid;

    public static TemplateRevision build(java.util.Map<String, ?> map) throws Exception {
        TemplateRevision self = new TemplateRevision();
        return TeaModel.build(map, self);
    }

    public TemplateRevision setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public TemplateRevision setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TemplateRevision setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public TemplateRevision setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public TemplateRevision setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TemplateRevision setSpec(TemplateSpec spec) {
        this.spec = spec;
        return this;
    }
    public TemplateSpec getSpec() {
        return this.spec;
    }

    public TemplateRevision setStatus(TemplateRevisionStatus status) {
        this.status = status;
        return this;
    }
    public TemplateRevisionStatus getStatus() {
        return this.status;
    }

    public TemplateRevision setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public TemplateRevision setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class TemplateRevisionStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://registry.serverless-devs.com/details.html?name=template-test&package_type=v3">https://registry.serverless-devs.com/details.html?name=template-test&amp;package_type=v3</a></p>
         */
        @NameInMap("packageUrl")
        public String packageUrl;

        /**
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("phase")
        public String phase;

        /**
         * <strong>example:</strong>
         * <p>p-default</p>
         */
        @NameInMap("pipelineName")
        public String pipelineName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cap.console.aliyun.com/template-detail?template=adasdasdaewe-adadqwe">https://cap.console.aliyun.com/template-detail?template=adasdasdaewe-adadqwe</a></p>
         */
        @NameInMap("templateUrl")
        public String templateUrl;

        public static TemplateRevisionStatus build(java.util.Map<String, ?> map) throws Exception {
            TemplateRevisionStatus self = new TemplateRevisionStatus();
            return TeaModel.build(map, self);
        }

        public TemplateRevisionStatus setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public TemplateRevisionStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public TemplateRevisionStatus setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public TemplateRevisionStatus setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

    }

}
