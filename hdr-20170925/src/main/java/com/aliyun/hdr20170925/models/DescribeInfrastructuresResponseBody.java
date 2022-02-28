// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeInfrastructuresResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Infrastructures")
    public DescribeInfrastructuresResponseBodyInfrastructures infrastructures;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInfrastructuresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInfrastructuresResponseBody self = new DescribeInfrastructuresResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInfrastructuresResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInfrastructuresResponseBody setInfrastructures(DescribeInfrastructuresResponseBodyInfrastructures infrastructures) {
        this.infrastructures = infrastructures;
        return this;
    }
    public DescribeInfrastructuresResponseBodyInfrastructures getInfrastructures() {
        return this.infrastructures;
    }

    public DescribeInfrastructuresResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInfrastructuresResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInfrastructuresResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInfrastructuresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInfrastructuresResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInfrastructuresResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure extends TeaModel {
        @NameInMap("Errno")
        public String errno;

        @NameInMap("InfrastructureId")
        public String infrastructureId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure build(java.util.Map<String, ?> map) throws Exception {
            DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure self = new DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure();
            return TeaModel.build(map, self);
        }

        public DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure setErrno(String errno) {
            this.errno = errno;
            return this;
        }
        public String getErrno() {
            return this.errno;
        }

        public DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure setInfrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            return this;
        }
        public String getInfrastructureId() {
            return this.infrastructureId;
        }

        public DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInfrastructuresResponseBodyInfrastructures extends TeaModel {
        @NameInMap("infrastructure")
        public java.util.List<DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure> infrastructure;

        public static DescribeInfrastructuresResponseBodyInfrastructures build(java.util.Map<String, ?> map) throws Exception {
            DescribeInfrastructuresResponseBodyInfrastructures self = new DescribeInfrastructuresResponseBodyInfrastructures();
            return TeaModel.build(map, self);
        }

        public DescribeInfrastructuresResponseBodyInfrastructures setInfrastructure(java.util.List<DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure> infrastructure) {
            this.infrastructure = infrastructure;
            return this;
        }
        public java.util.List<DescribeInfrastructuresResponseBodyInfrastructuresInfrastructure> getInfrastructure() {
            return this.infrastructure;
        }

    }

}
