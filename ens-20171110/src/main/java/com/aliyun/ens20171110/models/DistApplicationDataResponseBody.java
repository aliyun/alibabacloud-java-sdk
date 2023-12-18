// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DistApplicationDataResponseBody extends TeaModel {
    /**
     * <p>The list of ENS instance IDs.</p>
     */
    @NameInMap("DistInstanceIds")
    public DistApplicationDataResponseBodyDistInstanceIds distInstanceIds;

    /**
     * <p>The total number of ENS instance IDs.</p>
     */
    @NameInMap("DistInstanceTotalCount")
    public Integer distInstanceTotalCount;

    /**
     * <p>The distribution result of the data file.</p>
     */
    @NameInMap("DistResults")
    public DistApplicationDataResponseBodyDistResults distResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DistApplicationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DistApplicationDataResponseBody self = new DistApplicationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DistApplicationDataResponseBody setDistInstanceIds(DistApplicationDataResponseBodyDistInstanceIds distInstanceIds) {
        this.distInstanceIds = distInstanceIds;
        return this;
    }
    public DistApplicationDataResponseBodyDistInstanceIds getDistInstanceIds() {
        return this.distInstanceIds;
    }

    public DistApplicationDataResponseBody setDistInstanceTotalCount(Integer distInstanceTotalCount) {
        this.distInstanceTotalCount = distInstanceTotalCount;
        return this;
    }
    public Integer getDistInstanceTotalCount() {
        return this.distInstanceTotalCount;
    }

    public DistApplicationDataResponseBody setDistResults(DistApplicationDataResponseBodyDistResults distResults) {
        this.distResults = distResults;
        return this;
    }
    public DistApplicationDataResponseBodyDistResults getDistResults() {
        return this.distResults;
    }

    public DistApplicationDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DistApplicationDataResponseBodyDistInstanceIds extends TeaModel {
        @NameInMap("DistInstanceId")
        public java.util.List<String> distInstanceId;

        public static DistApplicationDataResponseBodyDistInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DistApplicationDataResponseBodyDistInstanceIds self = new DistApplicationDataResponseBodyDistInstanceIds();
            return TeaModel.build(map, self);
        }

        public DistApplicationDataResponseBodyDistInstanceIds setDistInstanceId(java.util.List<String> distInstanceId) {
            this.distInstanceId = distInstanceId;
            return this;
        }
        public java.util.List<String> getDistInstanceId() {
            return this.distInstanceId;
        }

    }

    public static class DistApplicationDataResponseBodyDistResultsDistResult extends TeaModel {
        /**
         * <p>The name of the data file.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The error code. The value is of the enumerated data type.</p>
         */
        @NameInMap("ResultCode")
        public Integer resultCode;

        /**
         * <p>The description of the distribution result.</p>
         */
        @NameInMap("ResultDescrip")
        public String resultDescrip;

        /**
         * <p>The version number of the data file.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DistApplicationDataResponseBodyDistResultsDistResult build(java.util.Map<String, ?> map) throws Exception {
            DistApplicationDataResponseBodyDistResultsDistResult self = new DistApplicationDataResponseBodyDistResultsDistResult();
            return TeaModel.build(map, self);
        }

        public DistApplicationDataResponseBodyDistResultsDistResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DistApplicationDataResponseBodyDistResultsDistResult setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public Integer getResultCode() {
            return this.resultCode;
        }

        public DistApplicationDataResponseBodyDistResultsDistResult setResultDescrip(String resultDescrip) {
            this.resultDescrip = resultDescrip;
            return this;
        }
        public String getResultDescrip() {
            return this.resultDescrip;
        }

        public DistApplicationDataResponseBodyDistResultsDistResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DistApplicationDataResponseBodyDistResults extends TeaModel {
        @NameInMap("DistResult")
        public java.util.List<DistApplicationDataResponseBodyDistResultsDistResult> distResult;

        public static DistApplicationDataResponseBodyDistResults build(java.util.Map<String, ?> map) throws Exception {
            DistApplicationDataResponseBodyDistResults self = new DistApplicationDataResponseBodyDistResults();
            return TeaModel.build(map, self);
        }

        public DistApplicationDataResponseBodyDistResults setDistResult(java.util.List<DistApplicationDataResponseBodyDistResultsDistResult> distResult) {
            this.distResult = distResult;
            return this;
        }
        public java.util.List<DistApplicationDataResponseBodyDistResultsDistResult> getDistResult() {
            return this.distResult;
        }

    }

}
