// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceInstanceDiagnosisResponseBody extends TeaModel {
    @NameInMap("Diagnosis")
    public DescribeServiceInstanceDiagnosisResponseBodyDiagnosis diagnosis;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceInstanceDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceInstanceDiagnosisResponseBody self = new DescribeServiceInstanceDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceInstanceDiagnosisResponseBody setDiagnosis(DescribeServiceInstanceDiagnosisResponseBodyDiagnosis diagnosis) {
        this.diagnosis = diagnosis;
        return this;
    }
    public DescribeServiceInstanceDiagnosisResponseBodyDiagnosis getDiagnosis() {
        return this.diagnosis;
    }

    public DescribeServiceInstanceDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceInstanceDiagnosisResponseBodyDiagnosis extends TeaModel {
        @NameInMap("Advices")
        public java.util.List<String> advices;

        @NameInMap("Causes")
        public java.util.List<String> causes;

        @NameInMap("Error")
        public String error;

        public static DescribeServiceInstanceDiagnosisResponseBodyDiagnosis build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceInstanceDiagnosisResponseBodyDiagnosis self = new DescribeServiceInstanceDiagnosisResponseBodyDiagnosis();
            return TeaModel.build(map, self);
        }

        public DescribeServiceInstanceDiagnosisResponseBodyDiagnosis setAdvices(java.util.List<String> advices) {
            this.advices = advices;
            return this;
        }
        public java.util.List<String> getAdvices() {
            return this.advices;
        }

        public DescribeServiceInstanceDiagnosisResponseBodyDiagnosis setCauses(java.util.List<String> causes) {
            this.causes = causes;
            return this;
        }
        public java.util.List<String> getCauses() {
            return this.causes;
        }

        public DescribeServiceInstanceDiagnosisResponseBodyDiagnosis setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

    }

}
