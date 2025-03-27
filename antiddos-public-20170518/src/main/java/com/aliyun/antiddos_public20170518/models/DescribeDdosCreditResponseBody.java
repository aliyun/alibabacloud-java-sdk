// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCreditResponseBody extends TeaModel {
    /**
     * <p>The details of the security credit score of the current Alibaba Cloud account in the specified region.</p>
     */
    @NameInMap("DdosCredit")
    public DescribeDdosCreditResponseBodyDdosCredit ddosCredit;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1F7BD73-8E9D-58D9-8658-CFC97112C641</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDdosCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCreditResponseBody self = new DescribeDdosCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCreditResponseBody setDdosCredit(DescribeDdosCreditResponseBodyDdosCredit ddosCredit) {
        this.ddosCredit = ddosCredit;
        return this;
    }
    public DescribeDdosCreditResponseBodyDdosCredit getDdosCredit() {
        return this.ddosCredit;
    }

    public DescribeDdosCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosCreditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDdosCreditResponseBodyDdosCredit extends TeaModel {
        /**
         * <p>The time period after which blackhole filtering is automatically deactivated in the specified region. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("BlackholeTime")
        public Integer blackholeTime;

        /**
         * <p>The security credit score. The full score is <strong>1000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>550</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The security credit level. Valid values:</p>
         * <ul>
         * <li><strong>A</strong>: outstanding</li>
         * <li><strong>B</strong>: excellent</li>
         * <li><strong>C</strong>: good</li>
         * <li><strong>D</strong>: average</li>
         * <li><strong>E</strong>: poor</li>
         * <li><strong>F</strong>: poorer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>D</p>
         */
        @NameInMap("ScoreLevel")
        public String scoreLevel;

        public static DescribeDdosCreditResponseBodyDdosCredit build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosCreditResponseBodyDdosCredit self = new DescribeDdosCreditResponseBodyDdosCredit();
            return TeaModel.build(map, self);
        }

        public DescribeDdosCreditResponseBodyDdosCredit setBlackholeTime(Integer blackholeTime) {
            this.blackholeTime = blackholeTime;
            return this;
        }
        public Integer getBlackholeTime() {
            return this.blackholeTime;
        }

        public DescribeDdosCreditResponseBodyDdosCredit setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public DescribeDdosCreditResponseBodyDdosCredit setScoreLevel(String scoreLevel) {
            this.scoreLevel = scoreLevel;
            return this;
        }
        public String getScoreLevel() {
            return this.scoreLevel;
        }

    }

}
