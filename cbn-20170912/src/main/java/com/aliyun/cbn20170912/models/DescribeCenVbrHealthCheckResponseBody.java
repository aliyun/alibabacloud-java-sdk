// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenVbrHealthCheckResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B8C9702E-304A-4E18-AC89-BE2D91C2C176</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VbrHealthChecks")
    public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks vbrHealthChecks;

    public static DescribeCenVbrHealthCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenVbrHealthCheckResponseBody self = new DescribeCenVbrHealthCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenVbrHealthCheckResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenVbrHealthCheckResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenVbrHealthCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenVbrHealthCheckResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenVbrHealthCheckResponseBody setVbrHealthChecks(DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks vbrHealthChecks) {
        this.vbrHealthChecks = vbrHealthChecks;
        return this;
    }
    public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks getVbrHealthChecks() {
        return this.vbrHealthChecks;
    }

    public static class DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck extends TeaModel {
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("Description")
        public String description;

        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        @NameInMap("HealthCheckOnly")
        public Boolean healthCheckOnly;

        @NameInMap("HealthCheckSourceIp")
        public String healthCheckSourceIp;

        @NameInMap("HealthCheckTargetIp")
        public String healthCheckTargetIp;

        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("VbrInstanceId")
        public String vbrInstanceId;

        @NameInMap("VbrInstanceRegionId")
        public String vbrInstanceRegionId;

        public static DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck self = new DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setHealthCheckOnly(Boolean healthCheckOnly) {
            this.healthCheckOnly = healthCheckOnly;
            return this;
        }
        public Boolean getHealthCheckOnly() {
            return this.healthCheckOnly;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setHealthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }
        public String getHealthCheckSourceIp() {
            return this.healthCheckSourceIp;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setHealthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setVbrInstanceId(String vbrInstanceId) {
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck setVbrInstanceRegionId(String vbrInstanceRegionId) {
            this.vbrInstanceRegionId = vbrInstanceRegionId;
            return this;
        }
        public String getVbrInstanceRegionId() {
            return this.vbrInstanceRegionId;
        }

    }

    public static class DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks extends TeaModel {
        @NameInMap("VbrHealthCheck")
        public java.util.List<DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck> vbrHealthCheck;

        public static DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks self = new DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks();
            return TeaModel.build(map, self);
        }

        public DescribeCenVbrHealthCheckResponseBodyVbrHealthChecks setVbrHealthCheck(java.util.List<DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck> vbrHealthCheck) {
            this.vbrHealthCheck = vbrHealthCheck;
            return this;
        }
        public java.util.List<DescribeCenVbrHealthCheckResponseBodyVbrHealthChecksVbrHealthCheck> getVbrHealthCheck() {
            return this.vbrHealthCheck;
        }

    }

}
