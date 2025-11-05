// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeliverListResponseBody extends TeaModel {
    /**
     * <p>The information about the tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;: [{&quot;deliverId&quot;: 1,&quot;status&quot;: &quot;enable&quot;,&quot;createTime&quot;: &quot;2020-10-14T11:19:26Z&quot;,&quot;crontab&quot;: &quot;0 0 0 \* \* ?&quot;,&quot;frequency&quot;: &quot;d&quot;,&quot;name&quot;: &quot;The name of the tracking task&quot;,&quot;dmList&quot;: [&quot;<a href="http://www.example.com%22%5D,%22reports">www.example.com&quot;],&quot;reports</a>&quot;: [{&quot;reportId&quot;: 1,&quot;conditions&quot;: [{&quot;op&quot;: &quot;in&quot;,&quot;field&quot;: &quot;prov&quot;,&quot;value&quot;: [&quot;Heilongjiang&quot;,&quot;Beijing&quot;]}} },{&quot;reportId&quot;: 2}],&quot;deliver&quot;: {&quot;email&quot;: {&quot;subject&quot;: &quot;subject&quot;,&quot;to&quot;: [&quot;<a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a>&quot;,&quot;<a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a>&quot;]}}}]}</p>
     */
    @NameInMap("Content")
    public DescribeCdnDeliverListResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnDeliverListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeliverListResponseBody self = new DescribeCdnDeliverListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeliverListResponseBody setContent(DescribeCdnDeliverListResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeCdnDeliverListResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeCdnDeliverListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnDeliverListResponseBodyContentDataDeliverEmail extends TeaModel {
        @NameInMap("to")
        public java.util.List<String> to;

        public static DescribeCdnDeliverListResponseBodyContentDataDeliverEmail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDeliverListResponseBodyContentDataDeliverEmail self = new DescribeCdnDeliverListResponseBodyContentDataDeliverEmail();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDeliverListResponseBodyContentDataDeliverEmail setTo(java.util.List<String> to) {
            this.to = to;
            return this;
        }
        public java.util.List<String> getTo() {
            return this.to;
        }

    }

    public static class DescribeCdnDeliverListResponseBodyContentDataDeliver extends TeaModel {
        @NameInMap("email")
        public DescribeCdnDeliverListResponseBodyContentDataDeliverEmail email;

        public static DescribeCdnDeliverListResponseBodyContentDataDeliver build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDeliverListResponseBodyContentDataDeliver self = new DescribeCdnDeliverListResponseBodyContentDataDeliver();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDeliverListResponseBodyContentDataDeliver setEmail(DescribeCdnDeliverListResponseBodyContentDataDeliverEmail email) {
            this.email = email;
            return this;
        }
        public DescribeCdnDeliverListResponseBodyContentDataDeliverEmail getEmail() {
            return this.email;
        }

    }

    public static class DescribeCdnDeliverListResponseBodyContentDataReports extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("reportId")
        public Long reportId;

        public static DescribeCdnDeliverListResponseBodyContentDataReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDeliverListResponseBodyContentDataReports self = new DescribeCdnDeliverListResponseBodyContentDataReports();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDeliverListResponseBodyContentDataReports setReportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }
        public Long getReportId() {
            return this.reportId;
        }

    }

    public static class DescribeCdnDeliverListResponseBodyContentData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-12-30T10:29:29Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>00 00 08 * * ?</p>
         */
        @NameInMap("crontab")
        public String crontab;

        @NameInMap("deliver")
        public DescribeCdnDeliverListResponseBodyContentDataDeliver deliver;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("deliverId")
        public Long deliverId;

        @NameInMap("dmList")
        public java.util.List<String> dmList;

        /**
         * <strong>example:</strong>
         * <p>d</p>
         */
        @NameInMap("frequency")
        public String frequency;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("reports")
        public java.util.List<DescribeCdnDeliverListResponseBodyContentDataReports> reports;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>-1d</p>
         */
        @NameInMap("timeEndFormat")
        public String timeEndFormat;

        /**
         * <strong>example:</strong>
         * <p>-1d</p>
         */
        @NameInMap("timeFromFormat")
        public String timeFromFormat;

        public static DescribeCdnDeliverListResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDeliverListResponseBodyContentData self = new DescribeCdnDeliverListResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDeliverListResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCdnDeliverListResponseBodyContentData setCrontab(String crontab) {
            this.crontab = crontab;
            return this;
        }
        public String getCrontab() {
            return this.crontab;
        }

        public DescribeCdnDeliverListResponseBodyContentData setDeliver(DescribeCdnDeliverListResponseBodyContentDataDeliver deliver) {
            this.deliver = deliver;
            return this;
        }
        public DescribeCdnDeliverListResponseBodyContentDataDeliver getDeliver() {
            return this.deliver;
        }

        public DescribeCdnDeliverListResponseBodyContentData setDeliverId(Long deliverId) {
            this.deliverId = deliverId;
            return this;
        }
        public Long getDeliverId() {
            return this.deliverId;
        }

        public DescribeCdnDeliverListResponseBodyContentData setDmList(java.util.List<String> dmList) {
            this.dmList = dmList;
            return this;
        }
        public java.util.List<String> getDmList() {
            return this.dmList;
        }

        public DescribeCdnDeliverListResponseBodyContentData setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

        public DescribeCdnDeliverListResponseBodyContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCdnDeliverListResponseBodyContentData setReports(java.util.List<DescribeCdnDeliverListResponseBodyContentDataReports> reports) {
            this.reports = reports;
            return this;
        }
        public java.util.List<DescribeCdnDeliverListResponseBodyContentDataReports> getReports() {
            return this.reports;
        }

        public DescribeCdnDeliverListResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCdnDeliverListResponseBodyContentData setTimeEndFormat(String timeEndFormat) {
            this.timeEndFormat = timeEndFormat;
            return this;
        }
        public String getTimeEndFormat() {
            return this.timeEndFormat;
        }

        public DescribeCdnDeliverListResponseBodyContentData setTimeFromFormat(String timeFromFormat) {
            this.timeFromFormat = timeFromFormat;
            return this;
        }
        public String getTimeFromFormat() {
            return this.timeFromFormat;
        }

    }

    public static class DescribeCdnDeliverListResponseBodyContent extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeCdnDeliverListResponseBodyContentData> data;

        public static DescribeCdnDeliverListResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDeliverListResponseBodyContent self = new DescribeCdnDeliverListResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDeliverListResponseBodyContent setData(java.util.List<DescribeCdnDeliverListResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeCdnDeliverListResponseBodyContentData> getData() {
            return this.data;
        }

    }

}
