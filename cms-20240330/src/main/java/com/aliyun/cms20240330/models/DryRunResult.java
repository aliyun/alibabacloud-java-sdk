// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DryRunResult extends TeaModel {
    /**
     * <p>The exit code. A value of 0 indicates that the validation passed. A value of 1 indicates that the request was rejected by business rules. For specific reasons, see violations. A value of 2 indicates that the request structure cannot be parsed and rule validation cannot be performed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("exitCode")
    public Integer exitCode;

    /**
     * <p>The text representation of the result. A value of ok indicates that the validation passed, and rejected indicates that the request was rejected by business rules. This field is empty when the exit code is 2, which means the request structure cannot be parsed.</p>
     * 
     * <strong>example:</strong>
     * <p>rejected</p>
     */
    @NameInMap("result")
    public String result;

    /**
     * <p>The list of violations. Each violation consists of three elements: field, message, and suggestion, which represent the path of the violated field, the violation description, and the remediation suggestion, respectively. This array is empty when the exit code is 0 (passed). All violations are listed when the exit code is 1 (rejected by business rules). The location and cause of the unparseable fields are provided when the exit code is 2 (unparseable request structure).</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;field&quot;:&quot;schedule.intervalSecs&quot;,&quot;message&quot;:&quot;schedule interval must be a multiple of 15 seconds&quot;,&quot;suggestion&quot;:&quot;must satisfy: 15-86400 seconds and a multiple of 15&quot;}]</p>
     */
    @NameInMap("violations")
    public java.util.List<DryRunViolation> violations;

    public static DryRunResult build(java.util.Map<String, ?> map) throws Exception {
        DryRunResult self = new DryRunResult();
        return TeaModel.build(map, self);
    }

    public DryRunResult setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }
    public Integer getExitCode() {
        return this.exitCode;
    }

    public DryRunResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DryRunResult setViolations(java.util.List<DryRunViolation> violations) {
        this.violations = violations;
        return this;
    }
    public java.util.List<DryRunViolation> getViolations() {
        return this.violations;
    }

}
