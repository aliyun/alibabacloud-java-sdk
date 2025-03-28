// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateStatus extends TeaModel {
    @NameInMap("latestDeployment")
    public TemplateStatusLatestDeployment latestDeployment;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("latestVersion")
    public String latestVersion;

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
     * <p><a href="https://cap.console.aliyun.com/template-detail?template=adasdasdaewe-adadqwe">https://cap.console.aliyun.com/template-detail?template=adasdasdaewe-adadqwe</a></p>
     */
    @NameInMap("templateUrl")
    public String templateUrl;

    public static TemplateStatus build(java.util.Map<String, ?> map) throws Exception {
        TemplateStatus self = new TemplateStatus();
        return TeaModel.build(map, self);
    }

    public TemplateStatus setLatestDeployment(TemplateStatusLatestDeployment latestDeployment) {
        this.latestDeployment = latestDeployment;
        return this;
    }
    public TemplateStatusLatestDeployment getLatestDeployment() {
        return this.latestDeployment;
    }

    public TemplateStatus setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public TemplateStatus setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public TemplateStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public TemplateStatus setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }
    public String getTemplateUrl() {
        return this.templateUrl;
    }

    public static class TemplateStatusLatestDeployment extends TeaModel {
        @NameInMap("finishedTime")
        public String finishedTime;

        /**
         * <strong>example:</strong>
         * <p>BuildFinished</p>
         */
        @NameInMap("phase")
        public String phase;

        @NameInMap("pipelineName")
        public String pipelineName;

        @NameInMap("startTime")
        public String startTime;

        public static TemplateStatusLatestDeployment build(java.util.Map<String, ?> map) throws Exception {
            TemplateStatusLatestDeployment self = new TemplateStatusLatestDeployment();
            return TeaModel.build(map, self);
        }

        public TemplateStatusLatestDeployment setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public TemplateStatusLatestDeployment setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public TemplateStatusLatestDeployment setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public TemplateStatusLatestDeployment setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
