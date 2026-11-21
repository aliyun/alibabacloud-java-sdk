// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DryRunViolation extends TeaModel {
    /**
     * <p>The path of the violated field, such as schedule.intervalSecs.</p>
     * 
     * <strong>example:</strong>
     * <p>schedule.intervalSecs</p>
     */
    @NameInMap("field")
    public String field;

    /**
     * <p>The violation description.</p>
     * 
     * <strong>example:</strong>
     * <p>schedule interval must be a multiple of 15 seconds</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The remediation suggestion.</p>
     * 
     * <strong>example:</strong>
     * <p>must satisfy: 15-86400 seconds and a multiple of 15</p>
     */
    @NameInMap("suggestion")
    public String suggestion;

    public static DryRunViolation build(java.util.Map<String, ?> map) throws Exception {
        DryRunViolation self = new DryRunViolation();
        return TeaModel.build(map, self);
    }

    public DryRunViolation setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DryRunViolation setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DryRunViolation setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

}
