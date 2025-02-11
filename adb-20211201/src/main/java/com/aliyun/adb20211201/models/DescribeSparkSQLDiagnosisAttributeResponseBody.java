// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>s202411071444hzdvk486d9d2001****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DiagnosisInfos")
    public java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfos;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ElapsedTime")
    public Long elapsedTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InnerQueryId")
    public Long innerQueryId;

    @NameInMap("OperatorListSortedByMetrics")
    public DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics operatorListSortedByMetrics;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public OperatorNode root;

    public static DescribeSparkSQLDiagnosisAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkSQLDiagnosisAttributeResponseBody self = new DescribeSparkSQLDiagnosisAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setDiagnosisInfos(java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfos) {
        this.diagnosisInfos = diagnosisInfos;
        return this;
    }
    public java.util.List<Adb4MysqlSparkDiagnosisInfo> getDiagnosisInfos() {
        return this.diagnosisInfos;
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }
    public Long getElapsedTime() {
        return this.elapsedTime;
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setInnerQueryId(Long innerQueryId) {
        this.innerQueryId = innerQueryId;
        return this;
    }
    public Long getInnerQueryId() {
        return this.innerQueryId;
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setOperatorListSortedByMetrics(DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics operatorListSortedByMetrics) {
        this.operatorListSortedByMetrics = operatorListSortedByMetrics;
        return this;
    }
    public DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics getOperatorListSortedByMetrics() {
        return this.operatorListSortedByMetrics;
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSparkSQLDiagnosisAttributeResponseBody setRoot(OperatorNode root) {
        this.root = root;
        return this;
    }
    public OperatorNode getRoot() {
        return this.root;
    }

    public static class DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics extends TeaModel {
        @NameInMap("OperatorListSortedByExclusiveTime")
        public java.util.List<SparkOperatorInfo> operatorListSortedByExclusiveTime;

        @NameInMap("OperatorListSortedByMaxMemory")
        public java.util.List<SparkOperatorInfo> operatorListSortedByMaxMemory;

        public static DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics self = new DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics setOperatorListSortedByExclusiveTime(java.util.List<SparkOperatorInfo> operatorListSortedByExclusiveTime) {
            this.operatorListSortedByExclusiveTime = operatorListSortedByExclusiveTime;
            return this;
        }
        public java.util.List<SparkOperatorInfo> getOperatorListSortedByExclusiveTime() {
            return this.operatorListSortedByExclusiveTime;
        }

        public DescribeSparkSQLDiagnosisAttributeResponseBodyOperatorListSortedByMetrics setOperatorListSortedByMaxMemory(java.util.List<SparkOperatorInfo> operatorListSortedByMaxMemory) {
            this.operatorListSortedByMaxMemory = operatorListSortedByMaxMemory;
            return this;
        }
        public java.util.List<SparkOperatorInfo> getOperatorListSortedByMaxMemory() {
            return this.operatorListSortedByMaxMemory;
        }

    }

}
