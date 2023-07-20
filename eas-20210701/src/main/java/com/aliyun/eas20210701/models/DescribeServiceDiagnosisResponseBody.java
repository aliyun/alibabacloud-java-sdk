// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceDiagnosisResponseBody extends TeaModel {
    @NameInMap("DiagnosisList")
    public java.util.List<DescribeServiceDiagnosisResponseBodyDiagnosisList> diagnosisList;

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
        @NameInMap("Advices")
        public java.util.List<String> advices;

        @NameInMap("Causes")
        public java.util.List<String> causes;

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
