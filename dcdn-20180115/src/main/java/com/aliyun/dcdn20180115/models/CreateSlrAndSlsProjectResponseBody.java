// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateSlrAndSlsProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

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
