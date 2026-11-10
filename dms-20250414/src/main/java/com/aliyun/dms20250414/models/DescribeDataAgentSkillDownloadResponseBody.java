// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentSkillDownloadResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DescribeDataAgentSkillDownloadResponseBodyData data;

    /**
     * <p>The error code returned when a request exception occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDataAgentSkillDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentSkillDownloadResponseBody self = new DescribeDataAgentSkillDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentSkillDownloadResponseBody setData(DescribeDataAgentSkillDownloadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataAgentSkillDownloadResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataAgentSkillDownloadResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDataAgentSkillDownloadResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDataAgentSkillDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataAgentSkillDownloadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDataAgentSkillDownloadResponseBodyData extends TeaModel {
        /**
         * <p>The public download link.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<em><strong><strong><strong>.oss-cn-hangzhou.aliyuncs.com/data_agent/skill_download/1673826</strong></strong></strong>66/ski-1giw1afhxxl6**<strong><strong><strong>ygcir/</strong></strong></strong></em>.zip?Expires=1793935883&amp;OSSAccessKeyId=STS.NXy5M8bN5wuNt*******NxDW&amp;Signature=%2FrU3FTVCAdtJJvZQvrftw6AWQug%3D&amp;response-content-disposition=attachment&amp;security-token=CAISiQR1q6Ft5B2yfSjIr5vMfveMj5EUwLeldmzA1lA6ZLlBob3vtTz2IHhMdXlrCOgYt%2F8xnG1V6f8flrJ%2FToQAX0HfatZq5ZkS9AqnaoXM%2Fte496IFg5D9pf1flOynjqHoeOzcYI734p7PAgm2FEYRrJL%2BcTK9JRPHVbSClZ9gaPkOQwC8dkAoLdxKJwxk2qh4UHzKLqSCPwLNiGjdB1YSZWMe71ly8qOi2MaRxwPDhVnhsI8vqp%2F2P4KvYrueVfWAOt6%2Bx75xbbGTknwSuRRP7%2BJ6hbBNvD7Is9eBRlJXpg6GOuzb8tRuawNweqENEqFJquS7jv55vujkm4PozRJKNO0SCnqAH9D6npWZQLr0bI9nK%2FHgOHWIi9%2BOKcD8vQM0cXZFKwRYKtQ8LWBhBhctUHbKMqPi9lTNfUK%2FQrOGlagt0pZ801zfpIXbfAnUGe%2FJi3dBY9kublsKT0dOhTG5K%2FJfLlEcKAg5WeevIN8tPEwEm8TBphbPUyBs9HZTssDlaune0qJlMt2nD8IdgNJDPc8Y6zZ3EA2qUcGnjkYFaWppRK1Oyq7mNISk6bmKzOyPaPTBDv0Xb%2BrupowlAUBnIFEnzk2ZjrVLATLwcBQLRCBzwt1KpKo%2FNH0u7BAEADeclSYSR4GYQXr9nsHtPA6ksAQWlPeWMacBiy9GOsPAqYv0GlbRDSX9P8FR8BqAARLcIr26y%2BphYuiqaegPh83GYEiMKKQS66fO%2FbR98Z9kD2BZrL%2FN3hztB48fQZyNeNE9AMmLzxuyk%2BHfEozrUOP7nvr%2F73NxdW5ydDWgil66VEwx5Grjy43Q3OZPIPUrn7t4WFMWd8oxvqgo47IApLHY3G5akK6pzYHmVrskTrtjIAA%3D</p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The internal network download link.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<em><strong><strong><strong>.oss-cn-hangzhou-internal.aliyuncs.com/data_agent/skill_download/1673826</strong></strong></strong>66/ski-1giw1afhxxl6**<strong><strong><strong>ygcir/</strong></strong></strong></em>.zip?Expires=1793935883&amp;OSSAccessKeyId=STS.NXy5M8bN5wuNt*******NxDW&amp;Signature=%2FrU3FTVCAdtJJvZQvrftw6AWQug%3D&amp;response-content-disposition=attachment&amp;security-token=CAISiQR1q6Ft5B2yfSjIr5vMfveMj5EUwLeldmzA1lA6ZLlBob3vtTz2IHhMdXlrCOgYt%2F8xnG1V6f8flrJ%2FToQAX0HfatZq5ZkS9AqnaoXM%2Fte496IFg5D9pf1flOynjqHoeOzcYI734p7PAgm2FEYRrJL%2BcTK9JRPHVbSClZ9gaPkOQwC8dkAoLdxKJwxk2qh4UHzKLqSCPwLNiGjdB1YSZWMe71ly8qOi2MaRxwPDhVnhsI8vqp%2F2P4KvYrueVfWAOt6%2Bx75xbbGTknwSuRRP7%2BJ6hbBNvD7Is9eBRlJXpg6GOuzb8tRuawNweqENEqFJquS7jv55vujkm4PozRJKNO0SCnqAH9D6npWZQLr0bI9nK%2FHgOHWIi9%2BOKcD8vQM0cXZFKwRYKtQ8LWBhBhctUHbKMqPi9lTNfUK%2FQrOGlagt0pZ801zfpIXbfAnUGe%2FJi3dBY9kublsKT0dOhTG5K%2FJfLlEcKAg5WeevIN8tPEwEm8TBphbPUyBs9HZTssDlaune0qJlMt2nD8IdgNJDPc8Y6zZ3EA2qUcGnjkYFaWppRK1Oyq7mNISk6bmKzOyPaPTBDv0Xb%2BrupowlAUBnIFEnzk2ZjrVLATLwcBQLRCBzwt1KpKo%2FNH0u7BAEADeclSYSR4GYQXr9nsHtPA6ksAQWlPeWMacBiy9GOsPAqYv0GlbRDSX9P8FR8BqAARLcIr26y%2BphYuiqaegPh83GYEiMKKQS66fO%2FbR98Z9kD2BZrL%2FN3hztB48fQZyNeNE9AMmLzxuyk%2BHfEozrUOP7nvr%2F73NxdW5ydDWgil66VEwx5Grjy43Q3OZPIPUrn7t4WFMWd8oxvqgo47IApLHY3G5akK6pzYHmVrskTrtjIAA%3D</p>
         */
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <p>The skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ski-04pomiln*************j0</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>data-query-skill</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        public static DescribeDataAgentSkillDownloadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAgentSkillDownloadResponseBodyData self = new DescribeDataAgentSkillDownloadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataAgentSkillDownloadResponseBodyData setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeDataAgentSkillDownloadResponseBodyData setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeDataAgentSkillDownloadResponseBodyData setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public DescribeDataAgentSkillDownloadResponseBodyData setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

    }

}
