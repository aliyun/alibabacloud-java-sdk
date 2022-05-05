// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListOnCallSchedulesResponseBody extends TeaModel {
    // 分页对象
    @NameInMap("PageBean")
    public ListOnCallSchedulesResponseBodyPageBean pageBean;

    // Id of the request
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
        // 排班策略描述
        @NameInMap("Description")
        public String description;

        // 排班策略ID
        @NameInMap("Id")
        public Long id;

        // 排班策略名称
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
        @NameInMap("OnCallSchedules")
        public java.util.List<ListOnCallSchedulesResponseBodyPageBeanOnCallSchedules> onCallSchedules;

        // 页数
        @NameInMap("Page")
        public Long page;

        // 每页展示数目
        @NameInMap("Size")
        public Long size;

        // 总数
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
