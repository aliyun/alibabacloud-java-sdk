// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListOnCallSchedulesResponseBody extends TeaModel {
    /**
     * <p>The objects that were returned.</p>
     */
    @NameInMap("PageBean")
    public ListOnCallSchedulesResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOnCallSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOnCallSchedulesResponseBody self = new ListOnCallSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOnCallSchedulesResponseBody setPageBean(ListOnCallSchedulesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListOnCallSchedulesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListOnCallSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules extends TeaModel {
        /**
         * <p>The description of the scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Test scheduling policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>OnCallSchedule_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules build(java.util.Map<String, ?> map) throws Exception {
            ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules self = new ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules();
            return TeaModel.build(map, self);
        }

        public ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListOnCallSchedulesResponseBodyPageBean extends TeaModel {
        /**
         * <p>The information about the scheduling policy.</p>
         */
        @NameInMap("OnCallSchedules")
        public java.util.List<ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules> onCallSchedules;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListOnCallSchedulesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListOnCallSchedulesResponseBodyPageBean self = new ListOnCallSchedulesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListOnCallSchedulesResponseBodyPageBean setOnCallSchedules(java.util.List<ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules> onCallSchedules) {
            this.onCallSchedules = onCallSchedules;
            return this;
        }
        public java.util.List<ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules> getOnCallSchedules() {
            return this.onCallSchedules;
        }

        public ListOnCallSchedulesResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListOnCallSchedulesResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListOnCallSchedulesResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
