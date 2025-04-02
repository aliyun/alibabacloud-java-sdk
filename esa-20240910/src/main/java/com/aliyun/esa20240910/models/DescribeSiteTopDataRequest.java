// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTopDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<DescribeSiteTopDataRequestFields> fields;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("Limit")
    public String limit;

    /**
     * <strong>example:</strong>
     * <p>1150376036*****</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteTopDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTopDataRequest self = new DescribeSiteTopDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTopDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteTopDataRequest setFields(java.util.List<DescribeSiteTopDataRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DescribeSiteTopDataRequestFields> getFields() {
        return this.fields;
    }

    public DescribeSiteTopDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteTopDataRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeSiteTopDataRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteTopDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSiteTopDataRequestFields extends TeaModel {
        @NameInMap("Dimension")
        public java.util.List<String> dimension;

        /**
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteTopDataRequestFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTopDataRequestFields self = new DescribeSiteTopDataRequestFields();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTopDataRequestFields setDimension(java.util.List<String> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.List<String> getDimension() {
            return this.dimension;
        }

        public DescribeSiteTopDataRequestFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
