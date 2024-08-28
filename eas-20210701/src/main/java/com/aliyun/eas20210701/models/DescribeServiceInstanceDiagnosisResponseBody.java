// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceInstanceDiagnosisResponseBody extends TeaModel {
    /**
     * <p>The diagnostics information.</p>
     */
    @NameInMap("Diagnosis")
    public DescribeServiceInstanceDiagnosisResponseBodyDiagnosis diagnosis;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82***</p>
     */
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
        /**
         * <p>The solutions to the errors.</p>
         */
        @NameInMap("Advices")
        public java.util.List<String> advices;

        /**
         * <p>The causes of the errors.</p>
         */
        @NameInMap("Causes")
        public java.util.List<String> causes;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Container worker0 failed to pull image.</p>
         */
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
