// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCalendarShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the calendar applies to all workspaces. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: All workspaces.</li>
     * <li>false: The workspaces specified by ProjectIds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllProjects")
    public Boolean allProjects;

    /**
     * <p>The description of the scheduling calendar. The description must be 5 to 2,048 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekday scheduling calendar</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The end date of the calendar validity period, in the <code>yyyy-mm-dd</code> format. Required when Type is set to StrongConstraint. The end date cannot be earlier than the start date, and the interval between the start date and the end date must be less than 5 years.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-09</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The expiration reminder. Required when Type is set to StrongConstraint. Valid values:</p>
     * <ul>
     * <li>OneMonthBefore: One month in advance.</li>
     * <li>OneWeekBefore: One week in advance.</li>
     * <li>ThreeDaysBefore: Three days in advance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OneMonthBefore</p>
     */
    @NameInMap("ExpirationReminder")
    public String expirationReminder;

    /**
     * <p>The default scheduling policy for dates that are not configured. Required when Type is set to WeakConstraint. Valid values:</p>
     * <ul>
     * <li>Normal: Normal scheduling.</li>
     * <li>Pause: Pause scheduling.</li>
     * <li>Skip: Dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("FallbackPolicy")
    public String fallbackPolicy;

    /**
     * <p>The ID of the scheduling calendar.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The scheduling policy after the calendar expires. Required when Type is set to StrongConstraint. Valid values:</p>
     * <ul>
     * <li>Normal: Normal scheduling.</li>
     * <li>Pause: Pause scheduling.</li>
     * <li>Skip: Dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Skip</p>
     */
    @NameInMap("OverduePolicy")
    public String overduePolicy;

    /**
     * <p>The account ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The list of applicable workspace IDs.</p>
     * <ul>
     * <li>Required and cannot be empty when AllProjects is set to false or left unspecified.</li>
     * <li>Leave empty or pass an empty array when AllProjects is set to true.</li>
     * </ul>
     */
    @NameInMap("ProjectIds")
    public String projectIdsShrink;

    /**
     * <p>The date scheduling policy. For a strong constraint calendar, the normal scheduling dates and non-scheduling dates must cover every day within the validity period and cannot overlap.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchedulePolicy")
    public String schedulePolicyShrink;

    /**
     * <p>The start date of the calendar validity period, in the <code>yyyy-mm-dd</code> format. Required when Type is set to StrongConstraint.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-08</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The calendar type. Valid values:</p>
     * <ul>
     * <li>StrongConstraint: Strong constraint calendar.</li>
     * <li>WeakConstraint: Weak constraint calendar.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StrongConstraint</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateCalendarShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCalendarShrinkRequest self = new UpdateCalendarShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCalendarShrinkRequest setAllProjects(Boolean allProjects) {
        this.allProjects = allProjects;
        return this;
    }
    public Boolean getAllProjects() {
        return this.allProjects;
    }

    public UpdateCalendarShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCalendarShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateCalendarShrinkRequest setExpirationReminder(String expirationReminder) {
        this.expirationReminder = expirationReminder;
        return this;
    }
    public String getExpirationReminder() {
        return this.expirationReminder;
    }

    public UpdateCalendarShrinkRequest setFallbackPolicy(String fallbackPolicy) {
        this.fallbackPolicy = fallbackPolicy;
        return this;
    }
    public String getFallbackPolicy() {
        return this.fallbackPolicy;
    }

    public UpdateCalendarShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateCalendarShrinkRequest setOverduePolicy(String overduePolicy) {
        this.overduePolicy = overduePolicy;
        return this;
    }
    public String getOverduePolicy() {
        return this.overduePolicy;
    }

    public UpdateCalendarShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateCalendarShrinkRequest setProjectIdsShrink(String projectIdsShrink) {
        this.projectIdsShrink = projectIdsShrink;
        return this;
    }
    public String getProjectIdsShrink() {
        return this.projectIdsShrink;
    }

    public UpdateCalendarShrinkRequest setSchedulePolicyShrink(String schedulePolicyShrink) {
        this.schedulePolicyShrink = schedulePolicyShrink;
        return this;
    }
    public String getSchedulePolicyShrink() {
        return this.schedulePolicyShrink;
    }

    public UpdateCalendarShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateCalendarShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
