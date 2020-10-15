// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DistApplicationDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DistInstanceTotalCount")
    @Validation(required = true)
    public Integer distInstanceTotalCount;

    @NameInMap("DistResults")
    @Validation(required = true)
    public DistApplicationDataResponseDistResults distResults;

    @NameInMap("DistInstanceIds")
    @Validation(required = true)
    public DistApplicationDataResponseDistInstanceIds distInstanceIds;

    public static DistApplicationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DistApplicationDataResponse self = new DistApplicationDataResponse();
        return TeaModel.build(map, self);
    }

    public DistApplicationDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DistApplicationDataResponse setDistInstanceTotalCount(Integer distInstanceTotalCount) {
        this.distInstanceTotalCount = distInstanceTotalCount;
        return this;
    }
    public Integer getDistInstanceTotalCount() {
        return this.distInstanceTotalCount;
    }

    public DistApplicationDataResponse setDistResults(DistApplicationDataResponseDistResults distResults) {
        this.distResults = distResults;
        return this;
    }
    public DistApplicationDataResponseDistResults getDistResults() {
        return this.distResults;
    }

    public DistApplicationDataResponse setDistInstanceIds(DistApplicationDataResponseDistInstanceIds distInstanceIds) {
        this.distInstanceIds = distInstanceIds;
        return this;
    }
    public DistApplicationDataResponseDistInstanceIds getDistInstanceIds() {
        return this.distInstanceIds;
    }

    public static class DistApplicationDataResponseDistResultsDistResult extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("ResultDescrip")
        @Validation(required = true)
        public String resultDescrip;

        @NameInMap("ResultCode")
        @Validation(required = true)
        public Integer resultCode;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DistApplicationDataResponseDistResultsDistResult build(java.util.Map<String, ?> map) throws Exception {
            DistApplicationDataResponseDistResultsDistResult self = new DistApplicationDataResponseDistResultsDistResult();
            return TeaModel.build(map, self);
        }

        public DistApplicationDataResponseDistResultsDistResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DistApplicationDataResponseDistResultsDistResult setResultDescrip(String resultDescrip) {
            this.resultDescrip = resultDescrip;
            return this;
        }
        public String getResultDescrip() {
            return this.resultDescrip;
        }

        public DistApplicationDataResponseDistResultsDistResult setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public Integer getResultCode() {
            return this.resultCode;
        }

        public DistApplicationDataResponseDistResultsDistResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DistApplicationDataResponseDistResults extends TeaModel {
        @NameInMap("DistResult")
        @Validation(required = true)
        public java.util.List<DistApplicationDataResponseDistResultsDistResult> distResult;

        public static DistApplicationDataResponseDistResults build(java.util.Map<String, ?> map) throws Exception {
            DistApplicationDataResponseDistResults self = new DistApplicationDataResponseDistResults();
            return TeaModel.build(map, self);
        }

        public DistApplicationDataResponseDistResults setDistResult(java.util.List<DistApplicationDataResponseDistResultsDistResult> distResult) {
            this.distResult = distResult;
            return this;
        }
        public java.util.List<DistApplicationDataResponseDistResultsDistResult> getDistResult() {
            return this.distResult;
        }

    }

    public static class DistApplicationDataResponseDistInstanceIds extends TeaModel {
        @NameInMap("DistInstanceId")
        @Validation(required = true)
        public java.util.List<String> distInstanceId;

        public static DistApplicationDataResponseDistInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DistApplicationDataResponseDistInstanceIds self = new DistApplicationDataResponseDistInstanceIds();
            return TeaModel.build(map, self);
        }

        public DistApplicationDataResponseDistInstanceIds setDistInstanceId(java.util.List<String> distInstanceId) {
            this.distInstanceId = distInstanceId;
            return this;
        }
        public java.util.List<String> getDistInstanceId() {
            return this.distInstanceId;
        }

    }

}
