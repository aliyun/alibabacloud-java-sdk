// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillFileDetectResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>8cfb1102cc5f56fe752f6e9b8c6f7f3d</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Result")
    public Integer result;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Score")
    public Integer score;

    public static GetSkillFileDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillFileDetectResultResponseBody self = new GetSkillFileDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillFileDetectResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillFileDetectResultResponseBody setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public GetSkillFileDetectResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillFileDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillFileDetectResultResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public GetSkillFileDetectResultResponseBody setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

}
