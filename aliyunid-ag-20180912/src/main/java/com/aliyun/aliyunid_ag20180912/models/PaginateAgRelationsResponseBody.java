// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class PaginateAgRelationsResponseBody extends TeaModel {
    @NameInMap("AgRelationDtos")
    public PaginateAgRelationsResponseBodyAgRelationDtos agRelationDtos;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static PaginateAgRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PaginateAgRelationsResponseBody self = new PaginateAgRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public PaginateAgRelationsResponseBody setAgRelationDtos(PaginateAgRelationsResponseBodyAgRelationDtos agRelationDtos) {
        this.agRelationDtos = agRelationDtos;
        return this;
    }
    public PaginateAgRelationsResponseBodyAgRelationDtos getAgRelationDtos() {
        return this.agRelationDtos;
    }

    public PaginateAgRelationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PaginateAgRelationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PaginateAgRelationsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PaginateAgRelationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PaginateAgRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PaginateAgRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PaginateAgRelationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto extends TeaModel {
        @NameInMap("Mpk")
        public String mpk;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Type")
        public String type;

        public static PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto build(java.util.Map<String, ?> map) throws Exception {
            PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto self = new PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto();
            return TeaModel.build(map, self);
        }

        public PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto setMpk(String mpk) {
            this.mpk = mpk;
            return this;
        }
        public String getMpk() {
            return this.mpk;
        }

        public PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PaginateAgRelationsResponseBodyAgRelationDtos extends TeaModel {
        @NameInMap("AgRelationDto")
        public java.util.List<PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto> agRelationDto;

        public static PaginateAgRelationsResponseBodyAgRelationDtos build(java.util.Map<String, ?> map) throws Exception {
            PaginateAgRelationsResponseBodyAgRelationDtos self = new PaginateAgRelationsResponseBodyAgRelationDtos();
            return TeaModel.build(map, self);
        }

        public PaginateAgRelationsResponseBodyAgRelationDtos setAgRelationDto(java.util.List<PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto> agRelationDto) {
            this.agRelationDto = agRelationDto;
            return this;
        }
        public java.util.List<PaginateAgRelationsResponseBodyAgRelationDtosAgRelationDto> getAgRelationDto() {
            return this.agRelationDto;
        }

    }

}
