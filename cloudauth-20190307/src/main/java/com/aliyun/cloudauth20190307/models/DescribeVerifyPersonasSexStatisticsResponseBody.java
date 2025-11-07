// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasSexStatisticsResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>013DA6E1-3F37-5579-B979-2F12B7E92450</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("ResultObject")
    public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject resultObject;

    public static DescribeVerifyPersonasSexStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasSexStatisticsResponseBody self = new DescribeVerifyPersonasSexStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasSexStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyPersonasSexStatisticsResponseBody setResultObject(DescribeVerifyPersonasSexStatisticsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyPersonasSexStatisticsResponseBodyResultObject extends TeaModel {
        /**
         * <p>Number of users under 14 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Age0To14Cnt")
        public Long age0To14Cnt;

        /**
         * <p>Proportion of users under 14 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Age0To14Rate")
        public String age0To14Rate;

        /**
         * <p>Number of users between 14 and 18 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Age14To18Cnt")
        public Long age14To18Cnt;

        /**
         * <p>Proportion of users between 14 and 18 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Age14To18Rate")
        public String age14To18Rate;

        /**
         * <p>Number of authenticated users between 18 and 35 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Age18To35Cnt")
        public Long age18To35Cnt;

        /**
         * <p>Proportion of authenticated users between 18 and 35 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>64.29</p>
         */
        @NameInMap("Age18To35Rate")
        public String age18To35Rate;

        /**
         * <p>Number of authenticated users between 35 and 50 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Age35To50Cnt")
        public Long age35To50Cnt;

        /**
         * <p>Proportion of users between 35 and 50 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>35.71</p>
         */
        @NameInMap("Age35To50Rate")
        public String age35To50Rate;

        /**
         * <p>Number of authenticated users over 50 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Age50To999Cnt")
        public Long age50To999Cnt;

        /**
         * <p>Proportion of authenticated users over 50 years old.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Age50To999Rate")
        public String age50To999Rate;

        /**
         * <p>Total number of authenticated users.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("AllUserCnt")
        public Long allUserCnt;

        /**
         * <p>Number of female users.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FemaleCnt")
        public Long femaleCnt;

        /**
         * <p>Proportion of female authenticated users.</p>
         * 
         * <strong>example:</strong>
         * <p>28.57</p>
         */
        @NameInMap("FemaleRate")
        public String femaleRate;

        /**
         * <p>Number of male users.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaleCnt")
        public Long maleCnt;

        /**
         * <p>Proportion of male users.</p>
         * 
         * <strong>example:</strong>
         * <p>71.43</p>
         */
        @NameInMap("MaleRate")
        public String maleRate;

        public static DescribeVerifyPersonasSexStatisticsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyPersonasSexStatisticsResponseBodyResultObject self = new DescribeVerifyPersonasSexStatisticsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge0To14Cnt(Long age0To14Cnt) {
            this.age0To14Cnt = age0To14Cnt;
            return this;
        }
        public Long getAge0To14Cnt() {
            return this.age0To14Cnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge0To14Rate(String age0To14Rate) {
            this.age0To14Rate = age0To14Rate;
            return this;
        }
        public String getAge0To14Rate() {
            return this.age0To14Rate;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge14To18Cnt(Long age14To18Cnt) {
            this.age14To18Cnt = age14To18Cnt;
            return this;
        }
        public Long getAge14To18Cnt() {
            return this.age14To18Cnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge14To18Rate(String age14To18Rate) {
            this.age14To18Rate = age14To18Rate;
            return this;
        }
        public String getAge14To18Rate() {
            return this.age14To18Rate;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge18To35Cnt(Long age18To35Cnt) {
            this.age18To35Cnt = age18To35Cnt;
            return this;
        }
        public Long getAge18To35Cnt() {
            return this.age18To35Cnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge18To35Rate(String age18To35Rate) {
            this.age18To35Rate = age18To35Rate;
            return this;
        }
        public String getAge18To35Rate() {
            return this.age18To35Rate;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge35To50Cnt(Long age35To50Cnt) {
            this.age35To50Cnt = age35To50Cnt;
            return this;
        }
        public Long getAge35To50Cnt() {
            return this.age35To50Cnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge35To50Rate(String age35To50Rate) {
            this.age35To50Rate = age35To50Rate;
            return this;
        }
        public String getAge35To50Rate() {
            return this.age35To50Rate;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge50To999Cnt(Long age50To999Cnt) {
            this.age50To999Cnt = age50To999Cnt;
            return this;
        }
        public Long getAge50To999Cnt() {
            return this.age50To999Cnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAge50To999Rate(String age50To999Rate) {
            this.age50To999Rate = age50To999Rate;
            return this;
        }
        public String getAge50To999Rate() {
            return this.age50To999Rate;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setAllUserCnt(Long allUserCnt) {
            this.allUserCnt = allUserCnt;
            return this;
        }
        public Long getAllUserCnt() {
            return this.allUserCnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setFemaleCnt(Long femaleCnt) {
            this.femaleCnt = femaleCnt;
            return this;
        }
        public Long getFemaleCnt() {
            return this.femaleCnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setFemaleRate(String femaleRate) {
            this.femaleRate = femaleRate;
            return this;
        }
        public String getFemaleRate() {
            return this.femaleRate;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setMaleCnt(Long maleCnt) {
            this.maleCnt = maleCnt;
            return this;
        }
        public Long getMaleCnt() {
            return this.maleCnt;
        }

        public DescribeVerifyPersonasSexStatisticsResponseBodyResultObject setMaleRate(String maleRate) {
            this.maleRate = maleRate;
            return this;
        }
        public String getMaleRate() {
            return this.maleRate;
        }

    }

}
