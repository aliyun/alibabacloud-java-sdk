// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateSlrAndSlsProjectResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about Log Service.</p>
     */
    @NameInMap("SlsInfo")
    public CreateSlrAndSlsProjectResponseBodySlsInfo slsInfo;

    public static CreateSlrAndSlsProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrAndSlsProjectResponseBody self = new CreateSlrAndSlsProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlrAndSlsProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSlrAndSlsProjectResponseBody setSlsInfo(CreateSlrAndSlsProjectResponseBodySlsInfo slsInfo) {
        this.slsInfo = slsInfo;
        return this;
    }
    public CreateSlrAndSlsProjectResponseBodySlsInfo getSlsInfo() {
        return this.slsInfo;
    }

    public static class CreateSlrAndSlsProjectResponseBodySlsInfo extends TeaModel {
        /**
         * <p>The endpoint of Log Service.</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>The Logstore of Log Service.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The project of Log Service.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The region where Log Service resides.</p>
         */
        @NameInMap("Region")
        public String region;

        public static CreateSlrAndSlsProjectResponseBodySlsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateSlrAndSlsProjectResponseBodySlsInfo self = new CreateSlrAndSlsProjectResponseBodySlsInfo();
            return TeaModel.build(map, self);
        }

        public CreateSlrAndSlsProjectResponseBodySlsInfo setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public CreateSlrAndSlsProjectResponseBodySlsInfo setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public CreateSlrAndSlsProjectResponseBodySlsInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateSlrAndSlsProjectResponseBodySlsInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
