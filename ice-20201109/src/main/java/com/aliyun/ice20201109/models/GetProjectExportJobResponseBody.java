// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetProjectExportJobResponseBody extends TeaModel {
    @NameInMap("ProjectExportJob")
    public GetProjectExportJobResponseBodyProjectExportJob projectExportJob;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectExportJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectExportJobResponseBody self = new GetProjectExportJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectExportJobResponseBody setProjectExportJob(GetProjectExportJobResponseBodyProjectExportJob projectExportJob) {
        this.projectExportJob = projectExportJob;
        return this;
    }
    public GetProjectExportJobResponseBodyProjectExportJob getProjectExportJob() {
        return this.projectExportJob;
    }

    public GetProjectExportJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectExportJobResponseBodyProjectExportJobExportResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;Type&quot;:&quot;Video&quot;,&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;,&quot;MediaURL&quot;:&quot;<a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4%22,%22TimelineIn%22:0.0,%22TimelineOut%22:5.0,%22In%22:0.0,%22Out%22:5.0,%22Speed%22:1.0,%22Duration%22:5.0,%22VirginDuration%22:13.334,%22Height%22:1.0,%22Width%22:1.0,%22X%22:0.0,%22Y%22:0.0%7D%5D%7D%5D%7D">https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4&quot;,&quot;TimelineIn&quot;:0.0,&quot;TimelineOut&quot;:5.0,&quot;In&quot;:0.0,&quot;Out&quot;:5.0,&quot;Speed&quot;:1.0,&quot;Duration&quot;:5.0,&quot;VirginDuration&quot;:13.334,&quot;Height&quot;:1.0,&quot;Width&quot;:1.0,&quot;X&quot;:0.0,&quot;Y&quot;:0.0}]}]}</a></p>
         */
        @NameInMap("Timeline")
        public String timeline;

        public static GetProjectExportJobResponseBodyProjectExportJobExportResult build(java.util.Map<String, ?> map) throws Exception {
            GetProjectExportJobResponseBodyProjectExportJobExportResult self = new GetProjectExportJobResponseBodyProjectExportJobExportResult();
            return TeaModel.build(map, self);
        }

        public GetProjectExportJobResponseBodyProjectExportJobExportResult setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

    }

    public static class GetProjectExportJobResponseBodyProjectExportJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExportResult")
        public GetProjectExportJobResponseBodyProjectExportJobExportResult exportResult;

        /**
         * <strong>example:</strong>
         * <p>BaseTimeline</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>The specified parameter is not valid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetProjectExportJobResponseBodyProjectExportJob build(java.util.Map<String, ?> map) throws Exception {
            GetProjectExportJobResponseBodyProjectExportJob self = new GetProjectExportJobResponseBodyProjectExportJob();
            return TeaModel.build(map, self);
        }

        public GetProjectExportJobResponseBodyProjectExportJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetProjectExportJobResponseBodyProjectExportJob setExportResult(GetProjectExportJobResponseBodyProjectExportJobExportResult exportResult) {
            this.exportResult = exportResult;
            return this;
        }
        public GetProjectExportJobResponseBodyProjectExportJobExportResult getExportResult() {
            return this.exportResult;
        }

        public GetProjectExportJobResponseBodyProjectExportJob setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public GetProjectExportJobResponseBodyProjectExportJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetProjectExportJobResponseBodyProjectExportJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetProjectExportJobResponseBodyProjectExportJob setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetProjectExportJobResponseBodyProjectExportJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProjectExportJobResponseBodyProjectExportJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
