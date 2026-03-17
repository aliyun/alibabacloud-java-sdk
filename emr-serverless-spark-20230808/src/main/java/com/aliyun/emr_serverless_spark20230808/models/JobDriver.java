// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class JobDriver extends TeaModel {
    /**
     * <p>The configurations of SparkSubmit.</p>
     */
    @NameInMap("sparkSubmit")
    public JobDriverSparkSubmit sparkSubmit;

    public static JobDriver build(java.util.Map<String, ?> map) throws Exception {
        JobDriver self = new JobDriver();
        return TeaModel.build(map, self);
    }

    public JobDriver setSparkSubmit(JobDriverSparkSubmit sparkSubmit) {
        this.sparkSubmit = sparkSubmit;
        return this;
    }
    public JobDriverSparkSubmit getSparkSubmit() {
        return this.sparkSubmit;
    }

    public static class JobDriverSparkSubmit extends TeaModel {
        /**
         * <p>The main program of Spark.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/entrypoint.jar</p>
         */
        @NameInMap("entryPoint")
        public String entryPoint;

        /**
         * <p>The parameters related to the main program of Spark.</p>
         */
        @NameInMap("entryPointArguments")
        public java.util.List<String> entryPointArguments;

        /**
         * <p>The command-line parameter of SparkSubmit.</p>
         * 
         * <strong>example:</strong>
         * <p>--conf spark.app.name=test</p>
         */
        @NameInMap("sparkSubmitParameters")
        public String sparkSubmitParameters;

        public static JobDriverSparkSubmit build(java.util.Map<String, ?> map) throws Exception {
            JobDriverSparkSubmit self = new JobDriverSparkSubmit();
            return TeaModel.build(map, self);
        }

        public JobDriverSparkSubmit setEntryPoint(String entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }
        public String getEntryPoint() {
            return this.entryPoint;
        }

        public JobDriverSparkSubmit setEntryPointArguments(java.util.List<String> entryPointArguments) {
            this.entryPointArguments = entryPointArguments;
            return this;
        }
        public java.util.List<String> getEntryPointArguments() {
            return this.entryPointArguments;
        }

        public JobDriverSparkSubmit setSparkSubmitParameters(String sparkSubmitParameters) {
            this.sparkSubmitParameters = sparkSubmitParameters;
            return this;
        }
        public String getSparkSubmitParameters() {
            return this.sparkSubmitParameters;
        }

    }

}
