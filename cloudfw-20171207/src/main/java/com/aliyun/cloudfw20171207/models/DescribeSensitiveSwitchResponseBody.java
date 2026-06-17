// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSensitiveSwitchResponseBody extends TeaModel {
    /**
     * <p>The total number of enabled items.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("OpenCount")
    public Long openCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F3ED45-5556-5AF3-ADE3-EE48FFF0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of sensitive data detection switches.</p>
     */
    @NameInMap("UserSensitiveDataSwitchList")
    public java.util.List<DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList> userSensitiveDataSwitchList;

    public static DescribeSensitiveSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveSwitchResponseBody self = new DescribeSensitiveSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveSwitchResponseBody setOpenCount(Long openCount) {
        this.openCount = openCount;
        return this;
    }
    public Long getOpenCount() {
        return this.openCount;
    }

    public DescribeSensitiveSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSensitiveSwitchResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeSensitiveSwitchResponseBody setUserSensitiveDataSwitchList(java.util.List<DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList> userSensitiveDataSwitchList) {
        this.userSensitiveDataSwitchList = userSensitiveDataSwitchList;
        return this;
    }
    public java.util.List<DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList> getUserSensitiveDataSwitchList() {
        return this.userSensitiveDataSwitchList;
    }

    public static class DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList extends TeaModel {
        /**
         * <p>The name of the sensitive credential category.</p>
         * 
         * <strong>example:</strong>
         * <p>Identity card</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The description of the sensitive credential.</p>
         * 
         * <strong>example:</strong>
         * <p>Sensitive ID card data leakage</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the sensitive credential.</p>
         * 
         * <strong>example:</strong>
         * <p>id_card</p>
         */
        @NameInMap("SensitiveCategory")
        public String sensitiveCategory;

        /**
         * <p>The sensitivity level.</p>
         * 
         * <strong>example:</strong>
         * <p>S3</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        /**
         * <p>The status of the sensitive data detection switch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SwitchStatus")
        public Integer switchStatus;

        public static DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList self = new DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList setSensitiveCategory(String sensitiveCategory) {
            this.sensitiveCategory = sensitiveCategory;
            return this;
        }
        public String getSensitiveCategory() {
            return this.sensitiveCategory;
        }

        public DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        public DescribeSensitiveSwitchResponseBodyUserSensitiveDataSwitchList setSwitchStatus(Integer switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public Integer getSwitchStatus() {
            return this.switchStatus;
        }

    }

}
