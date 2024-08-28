// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceDiagnosisResponseBody extends TeaModel {
    /**
     * <p>The diagnostics list.</p>
     */
    @NameInMap("DiagnosisList")
    public java.util.List<DescribeServiceDiagnosisResponseBodyDiagnosisList> diagnosisList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDiagnosisResponseBody self = new DescribeServiceDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDiagnosisResponseBody setDiagnosisList(java.util.List<DescribeServiceDiagnosisResponseBodyDiagnosisList> diagnosisList) {
        this.diagnosisList = diagnosisList;
        return this;
    }
    public java.util.List<DescribeServiceDiagnosisResponseBodyDiagnosisList> getDiagnosisList() {
        return this.diagnosisList;
    }

    public DescribeServiceDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceDiagnosisResponseBodyDiagnosisList extends TeaModel {
        /**
         * <p>The suggestions about how to handle the errors.</p>
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

        public static DescribeServiceDiagnosisResponseBodyDiagnosisList build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceDiagnosisResponseBodyDiagnosisList self = new DescribeServiceDiagnosisResponseBodyDiagnosisList();
            return TeaModel.build(map, self);
        }

        public DescribeServiceDiagnosisResponseBodyDiagnosisList setAdvices(java.util.List<String> advices) {
            this.advices = advices;
            return this;
        }
        public java.util.List<String> getAdvices() {
            return this.advices;
        }

        public DescribeServiceDiagnosisResponseBodyDiagnosisList setCauses(java.util.List<String> causes) {
            this.causes = causes;
            return this;
        }
        public java.util.List<String> getCauses() {
            return this.causes;
        }

        public DescribeServiceDiagnosisResponseBodyDiagnosisList setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

    }

}
