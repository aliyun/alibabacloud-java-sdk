// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisOperateRecordsResponseBody extends TeaModel {
    @NameInMap("DiagnosisOperateRecordModels")
    public java.util.List<DiagnosisOperateRecordModels> diagnosisOperateRecordModels;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiagnosisOperateRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisOperateRecordsResponseBody self = new DescribeDiagnosisOperateRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisOperateRecordsResponseBody setDiagnosisOperateRecordModels(java.util.List<DiagnosisOperateRecordModels> diagnosisOperateRecordModels) {
        this.diagnosisOperateRecordModels = diagnosisOperateRecordModels;
        return this;
    }
    public java.util.List<DiagnosisOperateRecordModels> getDiagnosisOperateRecordModels() {
        return this.diagnosisOperateRecordModels;
    }

    public DescribeDiagnosisOperateRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisOperateRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnosisOperateRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisOperateRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DiagnosisOperateRecordModels extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("NewInstanceType")
        public String newInstanceType;

        @NameInMap("NewZoneId")
        public String newZoneId;

        @NameInMap("OperateDate")
        public String operateDate;

        @NameInMap("OperateRecordType")
        public String operateRecordType;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DiagnosisOperateRecordModels build(java.util.Map<String, ?> map) throws Exception {
            DiagnosisOperateRecordModels self = new DiagnosisOperateRecordModels();
            return TeaModel.build(map, self);
        }

        public DiagnosisOperateRecordModels setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DiagnosisOperateRecordModels setNewInstanceType(String newInstanceType) {
            this.newInstanceType = newInstanceType;
            return this;
        }
        public String getNewInstanceType() {
            return this.newInstanceType;
        }

        public DiagnosisOperateRecordModels setNewZoneId(String newZoneId) {
            this.newZoneId = newZoneId;
            return this;
        }
        public String getNewZoneId() {
            return this.newZoneId;
        }

        public DiagnosisOperateRecordModels setOperateDate(String operateDate) {
            this.operateDate = operateDate;
            return this;
        }
        public String getOperateDate() {
            return this.operateDate;
        }

        public DiagnosisOperateRecordModels setOperateRecordType(String operateRecordType) {
            this.operateRecordType = operateRecordType;
            return this;
        }
        public String getOperateRecordType() {
            return this.operateRecordType;
        }

        public DiagnosisOperateRecordModels setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
